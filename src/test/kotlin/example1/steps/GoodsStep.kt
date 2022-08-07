package example1.steps

import io.cucumber.java.en.Given
import example1.model.Customer
import example1.model.Item
import example1.model.World

class GoodsStep(private val world: World) {

    @Given("^that (.*) bought a (.*) for \\$(\\d+)$")
    fun buyItem(name: String, itemType: String, price: Int) {
        world.setCustomer(Customer(name))
        world.setItem(Item(itemType, price))
    }
}
