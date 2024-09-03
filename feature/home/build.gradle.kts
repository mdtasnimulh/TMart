plugins {
    alias(libs.plugins.tmart.android.feature)
}

android {
    namespace = "com.tasnimulhasan.home"
}

dependencies {
    implementation(libs.shimmer)
    implementation(libs.androidx.palette)
    implementation(libs.glide)
    implementation(libs.lottie.animation)
    implementation(libs.bundles.play.services.maps)
}