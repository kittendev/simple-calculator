// Apply the application plugin to add support for building a CLI application
// and the Java plugin to add support for Java
plugins {
    id("java")
    application
}

// Define the group and version for the project
group = "org.a9"
version = "1.0-SNAPSHOT"

// This is used for publishing and dependency resolution
repositories {
    mavenCentral()
}

// Define the Java version compatibility
dependencies {
    testImplementation("org.junit.jupiter:junit-jupiter:5.10.2") // JUnit 5
    testRuntimeOnly("org.junit.platform:junit-platform-launcher") // JUnit Platform source: https://github.com/gradle/gradle/issues/13955#issue-667688825
}

// Define the source compatibility for Java
application {
    mainClass.set("org.a9.calculator.Main")
}

// Configure custom task to running the application
tasks.named<Jar>("jar") {
    // Add a manifest file to the jar
    manifest {
        attributes(
            "Main-Class" to "org.a9.calculator.Main"
        )
    }

    // Include the main class in the jar
    from(sourceSets.main.get().output)

    // ignore duplicate classes in the jar
    duplicatesStrategy = DuplicatesStrategy.EXCLUDE
}

// Define the test task to use JUnit Platform
// and configure test logging
tasks.test {
    useJUnitPlatform()
    testLogging {
        events("passed", "failed")
        exceptionFormat = org.gradle.api.tasks.testing.logging.TestExceptionFormat.FULL
    }

    afterSuite(KotlinClosure2<TestDescriptor, TestResult, Unit>({ desc, result ->
        if (desc.parent != null && desc.className != null) {
            val simpleClassName = desc.className?.substringAfterLast(".") ?: "UnknownClass"

            println("\nTest suite finished: $simpleClassName")
            println("" +
                    "Total tests: ${result.testCount}\n" +
                    "Passed: ${"\u001B[32m"}${result.successfulTestCount}${"\u001B[0m"}\n" +
                    "Failed: ${"\u001B[31m"}${result.failedTestCount}${"\u001B[0m"}\n"
            )
        }
    }))

    reports {
        html.required.set(true)
        junitXml.required.set(true)
    }
}
