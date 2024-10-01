package starter.helpers;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class Checkout {

    public static Performable proceed() {
        return Task.where("{0} proceeds to checkout",
                Click.on(PageObjectsSwag.CART_LINK),
                WaitUntil.the(PageObjectsSwag.CHECKOUT_BUTTON, isVisible()).forNoMoreThan(5).seconds(),
                Click.on(PageObjectsSwag.CHECKOUT_BUTTON)
        );
    }
}