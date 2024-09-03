package com.tmart

import org.gradle.api.JavaVersion

object AppConfig {
    const val APPLICATION_ID = "com.tasnimulhasan.tmart"
    const val MINIMUM_SDK_VERSION = 24
    const val COMPILE_SDK_VERSION = 34
    const val TARGET_SDK_VERSION = 34
    var testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    val compatibilityVersion = JavaVersion.VERSION_17
    const val VERSION_CODE  = 1
    const val VERSION_NAME  = "1.0.0"
}