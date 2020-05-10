plugins {
    `war`
}

dependencies {
    implementation(project(":projectX"))
    implementation("com.google.guava:guava:19.0")
}
