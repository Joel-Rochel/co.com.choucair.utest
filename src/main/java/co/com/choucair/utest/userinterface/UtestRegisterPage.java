package co.com.choucair.utest.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class UtestRegisterPage extends PageObject {
    public static final Target REGISTER_BUTTON = Target.the("Button that shows us the registration")
            .located(By.xpath("//a[@class='unauthenticated-nav-bar__sign-up']"));
}
