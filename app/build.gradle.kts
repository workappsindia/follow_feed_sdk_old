plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "com.workapps.sbipoc"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.workapps.sbipoc"
        minSdk = 26
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"

        buildFeatures {
            dataBinding = true
        }
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
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    kotlinOptions {
        jvmTarget = "11"
    }
}

dependencies {

    implementation("androidx.core:core-ktx:1.12.0")
    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.11.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")

    //for sdk
    implementation(fileTree(mapOf("dir" to "libs", "include" to listOf("*.jar", "*.aar"))))

    implementation ("com.android.volley:volley:1.2.1")
    implementation("com.google.android.gms:play-services-basement:18.2.0")

    api("com.github.bumptech.glide:glide:4.12.0")
    implementation ("androidx.browser:browser:1.5.0")

    implementation("com.google.code.gson:gson:2.8.9")
    // (Java only)
    implementation("androidx.work:work-runtime:2.7.1")
    implementation("com.google.firebase:firebase-messaging:23.1.2")

    implementation ("me.leolin:ShortcutBadger:1.1.22@aar")

}