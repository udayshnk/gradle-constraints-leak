plugins {
    `war`
}

dependencies {
    implementation(platform(project(":projectA")))
    implementation(project(":projectX"))
    implementation("com.google.guava:guava")
}
