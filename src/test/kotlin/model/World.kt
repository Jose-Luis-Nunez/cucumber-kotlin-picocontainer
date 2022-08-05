package model

class World {
    private lateinit var customer: Customer
    private lateinit var item: Item

    fun getCustomer(): Customer {
        return customer
    }

    fun setCustomer(customer: Customer) {
        this.customer = customer
    }

    fun setItem(item: Item) {
        this.item = item
    }

    fun getItem(): Item {
        return item
    }
}
