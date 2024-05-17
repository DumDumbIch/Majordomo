pluginManagement {
    repositories {
        google {
            content {
                includeGroupByRegex("com\\.android.*")
                includeGroupByRegex("com\\.google.*")
                includeGroupByRegex("androidx.*")
            }
        }
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "Majordomo"
// Application
include(":app")
// Base
include(":base:ui")
// Core
include(":core:di")
include(":core:design")
include(":core:eventbus")
include(":core:navigation")
// Feature
include(":feature:frame")
include(":feature:splash")
include(":feature:auth")
include(":feature:home")
include(":feature:payment")
// Tools
include(":tools:logger")
