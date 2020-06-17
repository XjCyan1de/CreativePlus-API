plugins {
    kotlin("jvm") version "1.3.72"
    maven
}

repositories {
    jcenter()
    maven { setUrl("https://papermc.io/repo/repository/maven-public/") }
    maven { setUrl("https://jitpack.io/") }
}

dependencies {
    implementation(kotlin("stdlib-jdk8"))
    implementation("org.jetbrains.kotlinx", "kotlinx-coroutines-core", "1.3.7")
    compileOnly("com.destroystokyo.paper", "paper-api", "1.15.2-R0.1-SNAPSHOT")
}

tasks {
    compileKotlin {
        kotlinOptions.jvmTarget = "1.8"
    }
    jar {
        doFirst {
            from({
                configurations.runtimeClasspath.get().map { if (it.isDirectory) it else zipTree(it) }
            })
        }
    }
}