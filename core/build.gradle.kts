plugins {
    id("java-library")
    id("org.jetbrains.kotlin.jvm")
}

java {
    sourceCompatibility = JavaVersion.VERSION_1_7
    targetCompatibility = JavaVersion.VERSION_1_7
}

dependencies {
    api("io.insert-koin:koin-core:3.4.2")
    api("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.7.2")
}
