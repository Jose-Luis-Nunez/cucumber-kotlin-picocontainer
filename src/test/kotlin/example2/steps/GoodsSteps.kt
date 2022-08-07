package example2.steps

import example2.model2.Customer
import example2.model2.Item
import io.cucumber.java.en.Given

class GoodsSteps(
    private var customer: Customer,
    private var item: Item
) {
    @Given("(.*) bought a (.*) for \\$(\\d+) in store$")
    fun buy(name: String, itemType: String, price: Long) {
        customer.name = name
        item.itemType = itemType
        item.price = price
    }
}
