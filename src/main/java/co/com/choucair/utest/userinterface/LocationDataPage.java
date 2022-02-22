package co.com.choucair.utest.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class LocationDataPage extends PageObject {
    public static final Target INPUT_CITY = Target.the("We write the city")
            .located(By.id("city"));
    public static final Target  INPUT_ZIP = Target.the("We write the postal code")
            .located(By.id("zip"));
    public static final Target  SELECT_COUNTRY = Target.the("We select the country")
            .located(By.xpath("//span[@class= 'ui-select-match-text pull-left']"));
    public static final Target  INPUT_COUNTRY = Target.the("We write the country")
            .located(By.xpath("//input[@placeholder= 'Select a country']"));
    public static final Target BUTTON_DEVICES = Target.the("Boton next:devives")
            .located(By.xpath("//a[contains(@class, 'btn btn-blue pull-right')]"));
}
