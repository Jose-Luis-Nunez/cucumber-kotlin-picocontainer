package example1.steps

import io.cucumber.java.en.Given
import example1.model.World

class GoodsStep(private var world: World) {

    @Given("^that (.*) bought a (.*) for \\$(\\d+)$")
    fun buyItem(name: String, itemType: String, price: Int) {
        world.customer.name = name
        world.item.itemType = itemType
        world.item.price = price
    }
}
