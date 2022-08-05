import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.7.10"
    id("se.thinkcode.cucumber-runner") version "0.0.11"
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    val cucumberVersion = "7.5.0"
    val hamcrestVersion = "2.2"
    testImplementation("io.cucumber:cucumber-java:$cucumberVersion")
    testImplementation("io.cucumber:cucumber-picocontainer:$cucumberVersion")
    testImplementation("org.hamcrest:hamcrest-library:$hamcrestVersion")
}
