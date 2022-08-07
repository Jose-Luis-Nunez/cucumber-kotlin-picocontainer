package example2.steps

import example2.model2.Customer
import example2.model2.Item
import io.cucumber.java.en.And
import io.cucumber.java.en.Then
import io.cucumber.java.en.When
import org.hamcrest.CoreMatchers
import org.hamcrest.MatcherAssert.assertThat

class CustomerSteps(
    private var customer: Customer,
    private var item: Item
) {
    @When("^John Doe returns (.*) to the store$")
    fun returnItem(itemType: String) {
        assertThat(item.itemType, CoreMatchers.`is`(itemType))
    }

    @And("shows receipt with price \\$(\\d+)$")
    fun showReceipt(price: Long) {
        customer.refund = item.price
        assertThat(item.price, CoreMatchers.`is`(price))
    }

    @Then("^customer will get \\$(\\d+) refunded from store$")
    fun itemGetRefunded(expected: Long) {
        assertThat(customer.refund, CoreMatchers.`is`(expected))
    }
}
