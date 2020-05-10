plugins {
    `java-library`
}

dependencies {
    implementation(platform(project(":projectA")))
    implementation("com.fasterxml.jackson.core:jackson-databind")
}
