package example1.steps

import io.cucumber.java.en.Then
import io.cucumber.java.en.When
import example1.model.World
import org.hamcrest.CoreMatchers.`is`
import org.hamcrest.MatcherAssert.assertThat

class CustomerStep(private var world: World) {

    @When("^customer return the (.*) to the store$")
    fun returnItem(itemType: String) {
        assertThat(world.item.itemType, `is`(itemType))
    }

    @When("^customer shows receipt$")
    fun showReceipt() {
        world.customer.refund = world.item.price
    }

    @Then("^customer will get \\$(\\d+) refunded$")
    fun itemGetRefunded(expected: Int) {
        val refund = world.customer.refund
        assertThat(refund, `is`(expected))
    }
}
