// Top-level build file where you can add configuration options common to all sub-projects/modules.
//plugins {
//    id("com.android.application") version "8.2.1" apply false
//    id("org.jetbrains.kotlin.android") version "1.9.10" apply false
//}


buildscript {
    repositories {
        mavenCentral()
    }
    dependencies {
        classpath("com.android.tools.build:gradle:8.2.2")
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.9.22")
    }
}

var kotlinVersion: String by extra
var javaVersion: JavaVersion by extra

ext {
    kotlinVersion = "1.9.22"
    javaVersion = JavaVersion.VERSION_11
}

plugins {
    id("com.android.application") version "8.2.2" apply false
    id("org.jetbrains.kotlin.android") version "1.9.22" apply false
}

