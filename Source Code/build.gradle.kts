// Top-level build file where you can add configuration options common to all sub-projects/modules.
//plugins {
//    id("com.android.application") version "8.2.1" apply false
//    id("org.jetbrains.kotlin.android") version "1.9.10" apply false
//}


buildscript {
    repositories {
        google()
    }
    dependencies {
        classpath ("com.android.tools.build:gradle:8.2.1")
        classpath ("org.jetbrains.kotlin:kotlin-gradle-plugin:1.7.1") // Updated version
    }
}

plugins {
    id ("com.android.application") version "8.2.1" apply false
    id ("org.jetbrains.kotlin.android") version "1.9.22" apply false // Updated version
}
