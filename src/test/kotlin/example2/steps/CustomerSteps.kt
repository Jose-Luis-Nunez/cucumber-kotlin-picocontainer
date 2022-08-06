package example2.steps

import example2.model2.CustomerContainer
import example2.model2.ItemContainer
import io.cucumber.java.en.And
import io.cucumber.java.en.Then
import io.cucumber.java.en.When
import org.hamcrest.CoreMatchers
import org.hamcrest.MatcherAssert.assertThat

class CustomerSteps(
    private var customer: CustomerContainer,
    private var item: ItemContainer
) {
    @When("^John Doe returns (.*) to the store$")
    fun returnItem(itemType: String) {
        assertThat(item.getItemType(), CoreMatchers.`is`(itemType))
    }

    @And("shows receipt with price \\$(\\d+)$")
    fun showReceipt(price: Int) {
        customer.refund(item.getPrice())
        assertThat(item.getPrice(), CoreMatchers.`is`(price))
    }

    @Then("^customer will get \\$(\\d+) refunded from store$")
    fun itemGetRefunded(expected: Int) {
        assertThat(customer.getRefunded(), CoreMatchers.`is`(expected))
    }
}
