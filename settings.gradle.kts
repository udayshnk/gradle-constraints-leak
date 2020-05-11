rootProject.name = "gradle-constraints-leak"
include(":projectA")
include(":projectX")
include(":projectY")
include(":projectB")
include(":projectZ")

project(":projectA").projectDir = file("projectA")
project(":projectX").projectDir = file("projectA/projectX")
project(":projectY").projectDir = file("projectA/projectY")
project(":projectB").projectDir = file("projectB")
project(":projectZ").projectDir = file("projectB/projectZ")
