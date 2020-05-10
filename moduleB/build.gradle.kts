plugins {
    `war`
}

dependencies {
    implementation(project(":subModuleA1"))
    implementation("com.google.guava:guava:19.0")
}