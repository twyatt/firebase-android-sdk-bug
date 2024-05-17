plugins {
    id("com.android.library")
    kotlin("android")
}

android {
    compileSdk = libs.versions.android.compile.get().toInt()
    defaultConfig.minSdk = libs.versions.android.min.get().toInt()
    namespace = "firebase.bug"
}

dependencies {
    implementation(libs.firebase.crashlytics)
    implementation(platform(libs.firebase.bom))
}
