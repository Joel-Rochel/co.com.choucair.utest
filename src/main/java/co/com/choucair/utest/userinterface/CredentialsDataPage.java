package co.com.choucair.utest.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class CredentialsDataPage extends PageObject {
    public static final Target INPUT_PASSWORD = Target.the("We write the password")
            .located(By.id("password"));
    public static final Target  INPUT_CONFIRM_PASSWORD = Target.the("We confirm the password")
            .located(By.id("confirmPassword"));
    public static final Target  CHECKBOX_INFORMED  =  Target.the("We mark to keep you informed")
            .located(By.xpath("//span[@class= 'checkmark signup-consent__checkbox signup-consent__checkbox--highlight']"));
    public static final Target  CHECKBOX_TERMS  =  Target.the("We mark to accept the terms")
            .located(By.xpath("//span[@class= 'checkmark signup-consent__checkbox error']"));
    public static final Target  CHECKBOX_PRIVACY  =  Target.the("We mark to accept privacy")
            .located(By.xpath("//span[@class= 'checkmark signup-consent__checkbox error']"));
    public static final Target BUTTON_COMPLETE = Target.the("Boton next:Last Step")
            .located(By.xpath("//a[contains(@class, 'btn btn-blue')]"));
}
