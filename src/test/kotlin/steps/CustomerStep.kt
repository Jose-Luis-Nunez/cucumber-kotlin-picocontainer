package steps

import io.cucumber.java.en.Then
import io.cucumber.java.en.When
import model.World
import org.hamcrest.CoreMatchers
import org.hamcrest.MatcherAssert

class CustomerStep(private val world: World) {

    @When("^customer return the (.*) to the store$")
    fun returnItem(itemType: String) {
        MatcherAssert.assertThat(world.getItem().getItemType(), CoreMatchers.`is`(itemType))
    }

    @When("^customer shows receipt$")
    fun showReceipt() {
        world.getCustomer().refund(world.getItem().getPrice())
    }

    @Then("^customer will get \\$(\\d+) refunded$")
    fun itemGetRefunded(expected: Int) {
        MatcherAssert.assertThat(world.getCustomer().getRefunded(), CoreMatchers.`is`(expected))
    }
}
