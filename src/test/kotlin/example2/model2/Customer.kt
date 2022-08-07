package example2.model2

abstract class Customer(
    open var name: String,
    open var refund: Long
) {
    override fun toString(): String {
        return "name: $name , refund: $refund"
    }
}
