package example1.model

data class Customer(
    var name: String = "",
    var refund: Int = 0
) {
    override fun toString() = "name: $name , refund: $refund"
}
