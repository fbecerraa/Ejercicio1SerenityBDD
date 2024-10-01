package starter.helpers;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

public class NavigateTo  {
    public static Performable thePageObjectsSwag() {
        return Task.where("{0} opens the swag labs page",
                Open.browserOn().the(PageObjectsSwag.class));
    }
}