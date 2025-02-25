plugins {
    kotlin("jvm") version "2.1.0"
    application
}

group = "dev.jason"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
    implementation(kotlin("stdlib-jdk8"))
}

tasks.test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(11)
    jvmToolchain(8)
}

application {
    mainClass = "org.example.MainKt"
}