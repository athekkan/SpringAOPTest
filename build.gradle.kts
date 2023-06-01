plugins {
    id("java")
}

group = "com.aop"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.8.1")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.8.1")
    implementation("org.springframework:spring-core:5.3.25")
    implementation("org.springframework:spring-context:5.3.25")
    //implementation("org.springframework:spring-aop:5.3.25")
    implementation("org.aspectj:aspectjtools:1.9.19")
}

tasks.getByName<Test>("test") {
    useJUnitPlatform()
}