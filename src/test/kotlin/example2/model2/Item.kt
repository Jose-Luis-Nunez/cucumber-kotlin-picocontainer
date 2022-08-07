package example2.model2

abstract class Item(
    open var itemType: String,
    open var price: Long
) {
    override fun toString(): String {
        return itemType
    }
}
