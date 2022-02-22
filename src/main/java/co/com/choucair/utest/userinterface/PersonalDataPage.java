package co.com.choucair.utest.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class PersonalDataPage extends PageObject {
    public static final Target INPUT_NAME = Target.the("We write the username")
            .located(By.id("firstName"));
    public static  final Target INPUT_LASTNAME = Target.the("We write the last name of the user")
            .located(By.id("lastName"));
    public static final Target INPUT_EMAIL = Target.the("We write the user email")
            .located(By.id("email"));
    public static final Target SELECT_MONTH = Target.the("We select the month of birth")
            .located(By.id("birthMonth"));
    public static final Target SELECT_DAY = Target.the("We select the day of birth")
            .located(By.id("birthDay"));
    public static final Target SELECT_YEAR = Target.the("We select the year of birth")
            .located(By.id("birthYear"));
    public static final Target INPUT_LANGUAGE_PAGE = Target.the("We write the language")
            .located(By.xpath("//input[@type= 'search']"));
    public static final Target BUTTON_LOCATION = Target.the("Button next:location")
            .located(By.xpath("//a[contains(@class, 'btn btn-blue')]"));
}
