plugins {
    alias(libs.plugins.tmart.android.library)
    alias(libs.plugins.tmart.android.hilt)
}

android {
    namespace = "com.tasnimulhasan.cache"
}

dependencies {
    implementation(libs.bundles.room.dependencies)
    implementation(libs.room.common)
    ksp(libs.room.compiler)
    implementation(projects.core.domain)
    androidTestImplementation(libs.test.junit)
    androidTestImplementation(libs.test.extjunit)
    androidTestImplementation(libs.test.espresso)
}