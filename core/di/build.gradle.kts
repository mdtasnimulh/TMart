plugins {
    alias(libs.plugins.tmart.android.library)
    alias(libs.plugins.tmart.android.hilt)
}

android {
    namespace = "com.tasnimulhasan.di"
}

dependencies {
    api(projects.core.sharedPref)
    implementation(libs.bundles.network.dependencies)
    implementation(libs.bundles.play.services.maps)
    implementation(libs.timber)

    androidTestImplementation(libs.test.junit)
    androidTestImplementation(libs.test.extjunit)
    androidTestImplementation(libs.test.espresso)
}