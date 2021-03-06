import org.jetbrains.kotlin.gradle.targets.js.testing.KotlinJsTest
import org.jetbrains.kotlin.gradle.targets.js.testing.mocha.KotlinMocha

/*
 * Copyright 2020 Vladimir Sitnikov <sitnikov.vladimir@gmail.com>
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

dependencies {
    implementation(project(":cache-service-mock"))
    implementation(project(":wrappers:actions-cache"))
    implementation(project(":wrappers:actions-core"))
    implementation(project(":wrappers:actions-exec"))
    implementation(project(":wrappers:actions-glob"))
    implementation(project(":wrappers:nodejs"))
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core")
    implementation("org.jetbrains.kotlinx:kotlinx-serialization-runtime")
}

tasks.withType<KotlinJsTest>().configureEach {
    (testFramework as KotlinMocha).timeout = "60000"
}
