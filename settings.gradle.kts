rootProject.name = "gradle-constraints-leak"
include(":projectA")
include(":projectX")
include(":projectY")
include(":projectB")

project(":projectA").projectDir = file("projectA")
project(":projectX").projectDir = file("projectA/projectX")
project(":projectY").projectDir = file("projectA/projectY")
project(":projectB").projectDir = file("projectB")
