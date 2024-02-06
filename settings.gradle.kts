pluginManagement {
    repositories {
        google()
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

rootProject.name = "class20240205"
include(":app")
include(":fragmentex")
include(":recyclerviewex")
include(":viewpagerex")
include(":drawerlayoutex")
include(":ch11_jetpack")
