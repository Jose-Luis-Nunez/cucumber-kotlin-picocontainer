package example2.model2

open class Item(
) {
    private var itemType: String = ""
    private var price: Int = 0

    fun getPrice(): Int {
        return price
    }

    fun setPrice(price: Int) {
        this.price = price
    }

    fun getItemType(): String {
        return itemType
    }

    fun setItemType(itemType: String?) {
        this.itemType = itemType!!
    }

    override fun toString(): String {
        return itemType
    }
}
