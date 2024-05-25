pluginManagement {
    repositories {
        google()
        mavenCentral()
        maven(url = "https://jitpack.io")  //Make sure to add this in your project for uCrop - an internal library
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
        maven(url = "https://jitpack.io")  //Make sure to add this in your project for uCrop - an internal library
    }
}

rootProject.name = "RentApp"
include(":app")
 