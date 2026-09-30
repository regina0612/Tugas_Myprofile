# My Profile App 

My Profile App adalah aplikasi sederhana yang dibuat menggunakan **Kotlin** dan **Jetpack Compose**. Aplikasi ini menampilkan informasi profil pengguna dalam satu halaman.

## Tools

* Menampilkan foto profil
* Menampilkan nama pengguna
* Menampilkan pekerjaan atau status sebagai mahasiswa
* Menampilkan bio singkat
* Menampilkan informasi email
* Menampilkan nomor telepon
* Menampilkan lokasi
* Tombol Follow

## Teknologi yang Digunakan

* Kotlin
* Jetpack Compose
* Material 3
* Android Studio

## Composable Function

Aplikasi ini menggunakan beberapa Composable Function yang reusable, yaitu:

* `ProfileScreen()`
* `ProfileHeader()`
* `ProfileBio()`
* `ProfileCard()`
* `InfoItem()`

## Tujuan

Aplikasi ini dibuat sebagai tugas untuk mempraktikkan penggunaan **Kotlin dan Jetpack Compose**, khususnya dalam membuat tampilan profil sederhana dengan beberapa Composable Function yang dapat digunakan kembali.

## Author

**Regina Cahyani Puteri**
**124140063**
Teknik Informatika


com.example.newsfeedsimulator

This is a Kotlin Multiplatform project targeting Android, Desktop (JVM).

* [/shared](./shared/src) is for code that will be shared across your Compose Multiplatform applications.
  It contains several subfolders:
  - [commonMain](./shared/src/commonMain/kotlin) is for code that’s common for all targets.
  - Other folders are for Kotlin code that will be compiled for only the platform indicated in the folder name.
    For example, if you want to use Apple’s CoreCrypto for the iOS part of your Kotlin app,
    the [iosMain](./shared/src/iosMain/kotlin) folder would be the right place for such calls.
    Similarly, if you want to edit the Desktop (JVM) specific part, the [jvmMain](./shared/src/jvmMain/kotlin)
    folder is the appropriate location.

### Running the apps

Use the run configurations provided by the run widget in your IDE's toolbar. You can also use these commands and options:

- Android app: `./gradlew :androidApp:assembleDebug`
- Desktop app:
  - Hot reload: `./gradlew :desktopApp:hotRun --auto`
  - Standard run: `./gradlew :desktopApp:run`

---

Learn more about [Kotlin Multiplatform](https://www.jetbrains.com/help/kotlin-multiplatform-dev/get-started.html)…

