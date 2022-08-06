package example2.steps

import example2.model2.CustomerContainer
import example2.model2.ItemContainer
import io.cucumber.java.en.Given

class GoodsSteps(
    private var customer: CustomerContainer,
    private var item: ItemContainer
) {
    @Given("(.*) bought a (.*) for \\$(\\d+) in store$")
    fun buy(name: String?, itemType: String?, price: Int) {
        customer.setName(name)
        item.setItemType(itemType)
        item.setPrice(price)
    }
}