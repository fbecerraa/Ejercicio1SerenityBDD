package starter.helpers;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class CompletePurchase {

    public static Performable withDetails(String firstName, String lastName, String postalCode) {
        return Task.where("{0} completes the purchase",
                Enter.theValue(firstName).into(PageObjectsSwag.FIRST_NAME_FIELD),
                Enter.theValue(lastName).into(PageObjectsSwag.LAST_NAME_FIELD),
                Enter.theValue(postalCode).into(PageObjectsSwag.POSTAL_CODE_FIELD),
                Click.on(PageObjectsSwag.CONTINUE_BUTTON),
                Click.on(PageObjectsSwag.FINISH_BUTTON)
        );
    }
}
