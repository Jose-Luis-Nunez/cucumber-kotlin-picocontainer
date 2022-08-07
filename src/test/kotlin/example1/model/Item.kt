package example1.model

data class Item(
    var itemType: String = "",
    var price: Int = 0
) {
    override fun toString() = itemType
}
