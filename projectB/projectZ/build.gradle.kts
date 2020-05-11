plugins {
    `java-library`
}

dependencies {
    implementation("com.google.guava:guava:19.0") {
	version {
            strictly("19.0")
        }
    }
}
