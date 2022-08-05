package steps

import io.cucumber.java.en.Given
import model.Customer
import model.Item
import model.World

class GoodsStep(private val world: World) {

    @Given("^that (.*) bought a (.*) for \\$(\\d+)$")
    fun buyItem(name: String, itemType: String, price: Int) {
        world.setCustomer(Customer(name))
        world.setItem(Item(itemType, price))
    }
}
