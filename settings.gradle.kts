pluginManagement {
    repositories {
        mavenCentral()
        gradlePluginPortal()
    }
    plugins{
        val kotlinVersion: String by settings
        kotlin("jvm") version kotlinVersion
    }
}

rootProject.name = "otuskotlin-oleg-project"

include("first-app")