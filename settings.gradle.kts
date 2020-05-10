rootProject.name = "gradle-sample-multi-module"
include(":moduleA")
include(":subModuleA1")
include(":subModuleA2")
include(":moduleB")

project(":moduleA").projectDir = file("moduleA")
project(":subModuleA1").projectDir = file("moduleA/subModuleA1")
project(":subModuleA2").projectDir = file("moduleA/subModuleA2")
project(":moduleB").projectDir = file("moduleB")