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
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[1]/div[4]/div[2]/div/div"));
    public static final Target  INPUT_COUNTRY = Target.the("We write the country")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[1]/div[4]/div[2]/div/div/input[1]"));
    public static final Target BUTTON_DEVICES = Target.the("Boton next:devives")
            .located(By.xpath("//a[contains(@class, 'btn btn-blue pull-right')]"));
}
