@file:Suppress("OPT_IN_IS_NOT_ENABLED")

import org.jetbrains.compose.ExperimentalComposeLibrary
import org.jetbrains.compose.desktop.application.dsl.TargetFormat

plugins {
    // Language plugin
    alias(libs.plugins.kotlin)

    // Compose desktop plugin
    alias(libs.plugins.compose)
}

// App distribution
compose.desktop {
    application {
        mainClass = "io.github.darvld.template.AppKt"

        nativeDistributions {
            targetFormats(TargetFormat.Dmg, TargetFormat.Msi, TargetFormat.Deb)
            packageName = "Link"
            packageVersion = "1.0.0"
        }
    }
}

sourceSets {
    main {
        kotlin.srcDir("src")
        resources.srcDir("resources")
    }

    test {
        kotlin.srcDir("test")
        resources.srcDir("testResources")
    }
}
println("")
dependencies {
    // Compose dependencies, using Material3 instead of 2 (default)
    @OptIn(ExperimentalComposeLibrary::class)
    implementation(compose.material3)
    implementation(compose.desktop.currentOs) { exclude("org.jetbrains.compose.material", "material") }

    // Native look for window decorations
    implementation(libs.compose.windowStyle)

    // Kotlin test dependencies (JUnit 5)
    testImplementation(kotlin("test"))
}

// Use JUnit 5's test runner
tasks.test {
    useJUnitPlatform()
}