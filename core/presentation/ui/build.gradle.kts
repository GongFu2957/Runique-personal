plugins {
    alias(libs.plugins.runique.android.library.compose)
}

android {
    namespace = "com.gongfu.core.presentation.ui"
}


dependencies {
    implementation(platform(libs.androidx.compose.bom))
    implementation(libs.bundles.compose)
    implementation(libs.androidx.lifecycle.runtime.compose)
    implementation(libs.androidx.lifecycle.viewmodel.compose)

    implementation(projects.core.domain)
    implementation(projects.core.presentation.designsystem)
    implementation(libs.androidx.constraintlayout)
}