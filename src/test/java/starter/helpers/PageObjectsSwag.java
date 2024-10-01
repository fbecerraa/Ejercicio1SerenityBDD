package starter.helpers;

import net.serenitybdd.annotations.DefaultUrl;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

@DefaultUrl("https://www.saucedemo.com/")
public class PageObjectsSwag extends PageObject {

    public static Target USERNAME_FIELD = Target.the("username")
            .located(By.id("user-name"));

    public static Target PASSWORD_FIELD = Target.the("password")
            .located(By.id("password"));

    public static Target ID_BUTTON= Target.the("login")
            .located(By.id("login-button"));

    public static Target PROD_TITLE = Target.the("title")
            .located(By.cssSelector("span.title[data-test='title']"));

    public static Target ADD_TO_CART_BACKPACK = Target.the("add to cart backpack")
            .located(By.id("add-to-cart-sauce-labs-backpack"));

    public static Target ADD_TO_CART_BIKE_LIGHT = Target.the("add to cart bike light")
            .located(By.id("add-to-cart-sauce-labs-bike-light"));

    public static Target CART_LINK = Target.the("shopping cart link")
            .located(By.xpath("//a[@class='shopping_cart_link']"));

    public static Target CHECKOUT_BUTTON = Target.the("checkout button")
            .located(By.id("checkout"));

    public static Target FIRST_NAME_FIELD = Target.the("first name")
            .located(By.id("first-name"));

    public static Target LAST_NAME_FIELD = Target.the("last name")
            .located(By.id("last-name"));

    public static Target POSTAL_CODE_FIELD = Target.the("postal code")
            .located(By.id("postal-code"));

    public static Target CONTINUE_BUTTON = Target.the("continue button")
            .located(By.id("continue"));

    public static Target FINISH_BUTTON = Target.the("finish button")
            .located(By.id("finish"));

    public static Target ALERT_MESSAGE = Target.the("alert message")
            .located(By.xpath("//h3[contains(text(),'Epic sadface: Username and password do not match a')]"));

    public static Target CONFIRMATION = Target.the("alert message")
            .located(By.xpath("//h2[@data-test='complete-header' and text()='Thank you for your order!']"));
}
