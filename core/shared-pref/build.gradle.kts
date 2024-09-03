plugins {
    alias(libs.plugins.tmart.android.library)
}

android {
    namespace = "com.tasnimulhasan.sharedpref"
}

dependencies {
    androidTestImplementation(libs.test.junit)
    androidTestImplementation(libs.test.extjunit)
    androidTestImplementation(libs.test.espresso)
}