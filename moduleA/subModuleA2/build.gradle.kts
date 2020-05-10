plugins {
    `war`
}

dependencies {
    implementation(platform(project(":moduleA")))
    implementation(project(":subModuleA1"))
    implementation("com.google.guava:guava")
}