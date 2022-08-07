package example2.model2

data class ItemContainer(
    override var itemType: String = "",
    override var price: Long = 0
) : Item(
    itemType,
    price
)
