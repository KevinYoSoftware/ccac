import Foundation

@objc public class ccac: NSObject {
    @objc public func echo(_ value: String) -> String {
        print(value)
        return value
    }
}
