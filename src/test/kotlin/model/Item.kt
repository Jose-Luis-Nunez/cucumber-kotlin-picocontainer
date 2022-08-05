package model

class Item(
    private var itemType: String,
    private var price: Int
) {
    fun getPrice(): Int {
        return price
    }

    fun getItemType(): String {
        return itemType
    }

    override fun toString(): String {
        return itemType
    }
}
