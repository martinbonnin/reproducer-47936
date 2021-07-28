plugins {
  id("org.jetbrains.kotlin.multiplatform").version("1.5.21")
  id("com.squareup.sqldelight").version("1.5.0")
  id("maven-publish")
}

repositories {
  mavenCentral()
}
kotlin {
  jvm()
  sourceSets {
  }
}

group = "com.example"

sqldelight {
  database("Database") {
    packageName = "com.example"
  }
}