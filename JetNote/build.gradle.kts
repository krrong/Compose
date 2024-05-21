// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    alias(libs.plugins.androidApplication) apply false
    alias(libs.plugins.jetbrainsKotlinAndroid) apply false
    id("org.jlleitschuh.gradle.ktlint") version "12.1.1"
}
// plugins {
//    id("com.android.application") version "8.3.2" apply false
//    id("org.jetbrains.kotlin.android") version "1.9.0" apply false
//    id("org.jlleitschuh.gradle.ktlint") version "12.1.1"
// }
//
// allprojects {
//    apply(plugin = "org.jlleitschuh.gradle.ktlint")
// }
