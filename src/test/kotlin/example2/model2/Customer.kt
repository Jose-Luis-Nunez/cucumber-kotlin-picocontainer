package example2.model2

data class Customer(
    var name: String = "",
    var refund: Long = 0
) {
    override fun toString() = "name: $name , refund: $refund"
}
