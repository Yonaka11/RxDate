plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    id("kotlin-kapt")

}


android {
    namespace = "com.asada.myapplication"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.asada.myapplication"
        minSdk = 27
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_19
        targetCompatibility = JavaVersion.VERSION_19
    }
    kotlinOptions {
        jvmTarget = "19"
    }
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = "1.5.15"  // Compose compiler version
    }
}

dependencies {

    // Core Android dependencies
    implementation ("androidx.core:core-ktx:1.12.0")
    implementation ("androidx.appcompat:appcompat:1.7.0")
    implementation( "com.google.android.material:material:1.10.0")

    // Jetpack Compose dependencies
    implementation( "androidx.compose.ui:ui:1.5.0")
    implementation ("androidx.compose.material:material:1.5.0")
    implementation ("androidx.compose.ui:ui-tooling-preview:1.5.0")

    // AndroidX lifecycle dependencies
    implementation ("androidx.lifecycle:lifecycle-runtime-ktx:2.6.1")
    implementation( "androidx.activity:activity-compose:1.8.0")

    // Unit testing
    testImplementation ("junit:junit:4.13.2")
    androidTestImplementation ("androidx.test.ext:junit:1.1.6")
    androidTestImplementation ("androidx.test.espresso:espresso-core:3.5.1")
    androidTestImplementation ("androidx.compose.ui:ui-test-junit4:1.5.0")

    // Optional for debugging
    debugImplementation ("androidx.compose.ui:ui-tooling:1.5.0")
    debugImplementation ("androidx.compose.ui:ui-test-manifest:1.5.0")
}