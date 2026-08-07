## Laundry & Dry Cleaning Customer App
Manage your laundry on the go. Your all-in-one laundry and dry cleaning companion keeps you updated every step of the way. Create your profile, track real-time order status, and get instant notifications when your clothes are ready. Activate your customer card's QR code at our onsite kiosks to drop off laundry in seconds—no forms, no hassle. Clean clothes, simplified.

This is a Supernova project targeting Android and iOS with KMP (Kotlin Multiplatform) using Kotlin and Jetpack Compose.
This source code and every resource included in this package is licensed under [Supernova Technology License v1.0](http://www.supernovait.se/stl1.txt)

### Running the apps

Use the run configurations provided by the run widget in your IDE's toolbar. You can also use these commands and options:

- Android app: `./gradlew :androidApp:assembleDebug`
- iOS app: open the [/iosApp](./iosApp) directory in Xcode and run it from there.

### Running tests

Use the run button in your IDE's editor gutter, or run tests using Gradle tasks:

- Android tests: `./gradlew :shared:testAndroidHostTest`
- iOS tests: `./gradlew :shared:iosSimulatorArm64Test`
