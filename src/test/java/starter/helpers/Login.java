package starter.helpers;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Click;

public class Login {

    public static Performable withCredentials(String username, String password) {
        return Task.where("{0} attempts to log in with username and password",
                Enter.theValue(username).into(PageObjectsSwag.USERNAME_FIELD),
                Enter.theValue(password).into(PageObjectsSwag.PASSWORD_FIELD),
                Click.on(PageObjectsSwag.ID_BUTTON)
        );
    }
}