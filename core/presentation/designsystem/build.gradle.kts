plugins {
    alias(libs.plugins.runique.android.library.compose)
}

android {
    namespace = "com.gongfu.core.presentation.designsystem"
}


dependencies {
    implementation(platform(libs.androidx.compose.bom))
    implementation(libs.bundles.compose)
    debugImplementation(libs.bundles.compose.debug)
    api(libs.bundles.compose)
}