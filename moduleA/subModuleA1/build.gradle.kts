plugins {
    `java-library`
}

dependencies {
    implementation(platform(project(":moduleA")))
    implementation("com.fasterxml.jackson.core:jackson-databind")
}