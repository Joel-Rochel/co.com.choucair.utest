package co.com.choucair.utest.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class DevicesDataPage extends PageObject {
    public static final Target SELECT_COMPUTER = Target.the("We select the computer")
            .located(By.xpath("//span[@class= 'ui-select-match-text pull-left ui-select-allow-clear']"));
    public static final Target  INPUT_COMPUTER = Target.the("We write the computer")
            .located(By.xpath("//input[@placeholder= 'Select OS']"));
    public static final Target  SELECT_VERSION = Target.the("We select the version of the OS")
            .located(By.xpath("//span[@aria-label= 'Select a Version']"));
    public static final Target  INPUT_VERSION = Target.the("We write the OS version")
            .located(By.xpath("//input[@placeholder= 'Select a Version']"));
    public static final Target  SELECT_LANGUAGE = Target.the("We select the language")
            .located(By.xpath("//span[@aria-label= 'Select OS language']"));
    public static final Target  INPUT_LANGUAGE = Target.the("We write the language")
            .located(By.xpath("//input[@placeholder= 'Select OS language']"));
    public static final Target  SELECT_MOBILE = Target.the("We select the cell phone")
            .located(By.xpath("//span[@class= 'ui-select-placeholder text-muted']"));
    public static final Target  INPUT_MOBILE = Target.the("We write the cell")
            .located(By.xpath("//input[@placeholder= 'Select Brand']"));
    public static final Target  SELECT_MODEL = Target.the("We select the model")
            .located(By.xpath("//span[@class= 'ui-select-placeholder text-muted']"));
    public static final Target  INPUT_MODEL = Target.the("We write the model")
            .located(By.xpath("//input[@placeholder= 'Select a Model']"));
    public static final Target  SELECT_OS = Target.the("We select the OS of the cell phone")
            .located(By.xpath("//span[@class= 'ui-select-placeholder text-muted']"));
    public static final Target  INPUT_OS = Target.the("We write the OS of the cell phone")
            .located(By.xpath("//div[@id='mobile-device']/div/div/div/input[@placeholder='Select OS']"));
    public static final Target BUTTON_LASTSTEP = Target.the("Boton next:Last Step")
            .located(By.xpath("//a[contains(@class, 'btn btn-blue pull-right')]"));
}
