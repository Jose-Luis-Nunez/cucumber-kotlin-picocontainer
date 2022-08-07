package example2.model2

data class Item(
    var itemType: String = "",
    var price: Long = 0
) {
    override fun toString() = itemType
}
