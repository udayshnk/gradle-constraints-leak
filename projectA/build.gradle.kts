plugins {
    `java-platform`
}

javaPlatform {
    allowDependencies()
}

dependencies {
    api(platform("com.fasterxml.jackson:jackson-bom:2.9.8"))
    constraints {
        api("com.google.guava:guava:29.0-jre")
    }
}
