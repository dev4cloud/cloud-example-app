plugins {
    java
    id("org.springframework.boot") version "2.4.4"
}

apply(plugin = "io.spring.dependency-management")

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

extra["junitVersion"] = "5.4.2"

dependencies {
    implementation("org.springframework.boot:spring-boot-starter-web")
    implementation("org.springframework.boot:spring-boot-starter-data-jpa")
    implementation("org.postgresql:postgresql")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:${project.extra["junitVersion"]}")
    testImplementation("org.junit.jupiter:junit-jupiter-params:${project.extra["junitVersion"]}")
    testImplementation("org.junit.jupiter:junit-jupiter:${project.extra["junitVersion"]}")
}
