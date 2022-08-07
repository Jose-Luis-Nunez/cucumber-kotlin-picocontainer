package example2.model2

data class CustomerContainer(
    override var name: String,
    override var refund: Long = 0
) : Customer(
    name,
    refund
)
