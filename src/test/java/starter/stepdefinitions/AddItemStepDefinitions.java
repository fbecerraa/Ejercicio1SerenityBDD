package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.questions.Text;
import org.junit.Assert;
import starter.helpers.*;


public class AddItemStepDefinitions {

    @Given("{actor} enter the page")
    public void freddy_enter_the_page(Actor actor) {
        actor.wasAbleTo(NavigateTo.thePageObjectsSwag());
    }

    @When("he logs in with {string} and {string}")
    public void heLogsInWithAnd(String username, String password) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                Login.withCredentials(username, password)
        );
    }

    @Then("he sees the title {string}")
    public void he_sees_the_title(String expectedTitle) {
        String actualTitle = OnStage.theActorInTheSpotlight().asksFor(Text.of(PageObjectsSwag.PROD_TITLE).asString());
        Assert.assertEquals("The page title should be correct", expectedTitle, actualTitle);

    }

    @Then("he adds to cart two products")
    public void he_adds_to_cart_two_products() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                AddToCart.bothItems()
        );
    }

    @And("he makes checkout")
    public void heMakesCheckout() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                Checkout.proceed()
        );
    }

    @And("he completes the purchase with {string},{string} and {string}:")
    public void heCompletesThePurchaseWithAnd(String firstName, String lastName, String postalCode) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                CompletePurchase.withDetails(firstName, lastName, postalCode)
        );
    }

    @Then("confirm purchase with alert {string}")
    public void confirmPurchaseWithAlert(String expectedConfirmationMessage) {
        String actualConfirmationMessage = OnStage.theActorInTheSpotlight().asksFor(Text.of(PageObjectsSwag.CONFIRMATION).asString());
        Assert.assertEquals("The alert message should be correct", expectedConfirmationMessage, actualConfirmationMessage);
    }

    @Given("{actor} attempts to enter de page")
    public void AttemptsToEnterDePage(Actor actor) {
        actor.wasAbleTo(NavigateTo.thePageObjectsSwag());
    }

    @When("he type wrong credentials {string} and {string}")
    public void heTypeWrongCredentialsAnd(String username, String password) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                Login.withCredentials(username, password)
        );
    }

    @Then("the alert is presented {string}")
    public void theAlertIsPresented(String expectedAlertMessage) {
        String actualAlertMessage = OnStage.theActorInTheSpotlight().asksFor(Text.of(PageObjectsSwag.ALERT_MESSAGE).asString());
        Assert.assertEquals("The alert message should be correct", expectedAlertMessage, actualAlertMessage);
    }
}
