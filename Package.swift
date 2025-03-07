// swift-tools-version: 5.9
import PackageDescription

let package = Package(
    name: "Ccac",
    platforms: [.iOS(.v14)],
    products: [
        .library(
            name: "Ccac",
            targets: ["ccacPlugin"])
    ],
    dependencies: [
        .package(url: "https://github.com/ionic-team/capacitor-swift-pm.git", from: "7.0.0")
    ],
    targets: [
        .target(
            name: "ccacPlugin",
            dependencies: [
                .product(name: "Capacitor", package: "capacitor-swift-pm"),
                .product(name: "Cordova", package: "capacitor-swift-pm")
            ],
            path: "ios/Sources/ccacPlugin"),
        .testTarget(
            name: "ccacPluginTests",
            dependencies: ["ccacPlugin"],
            path: "ios/Tests/ccacPluginTests")
    ]
)