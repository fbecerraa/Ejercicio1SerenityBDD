package starter.helpers;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class AddToCart {

    public static Performable backpack() {
        return Task.where("{0} adds the backpack to the cart",
                Click.on(PageObjectsSwag.ADD_TO_CART_BACKPACK)
        );
    }

    public static Performable bikeLight() {
        return Task.where("{0} adds the bike light to the cart",
                Click.on(PageObjectsSwag.ADD_TO_CART_BIKE_LIGHT)
        );
    }

    public static Performable bothItems() {
        return Task.where("{0} adds both items to the cart",
                Click.on(PageObjectsSwag.ADD_TO_CART_BACKPACK),
                Click.on(PageObjectsSwag.ADD_TO_CART_BIKE_LIGHT)
        );
    }
}
