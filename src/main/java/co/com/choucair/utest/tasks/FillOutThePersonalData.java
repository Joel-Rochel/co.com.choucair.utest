package co.com.choucair.utest.tasks;

import co.com.choucair.utest.model.UtestData;
import co.com.choucair.utest.userinterface.PersonalDataPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import org.openqa.selenium.Keys;

import java.util.List;

import static co.com.choucair.utest.userinterface.PersonalDataPage.*;


public class FillOutThePersonalData implements Task {

    private List<UtestData> data;

    public FillOutThePersonalData(List<UtestData> data) {
        this.data = data;
    }

    public static FillOutThePersonalData onThePage(List<UtestData> data) {
        return Tasks.instrumented(FillOutThePersonalData.class, data);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(data.get(0).getStrName()).into(INPUT_NAME),
                Enter.theValue(data.get(0).getStrLastName()).into(INPUT_LASTNAME),
                Enter.theValue(data.get(0).getStrEmail()).into(INPUT_EMAIL),
                SelectFromOptions.byVisibleText(data.get(0).getStrMonth()).from(SELECT_MONTH),
                SelectFromOptions.byVisibleText(data.get(0).getStrDay()).from(SELECT_DAY),
                SelectFromOptions.byVisibleText(data.get(0).getStrYear()).from(SELECT_YEAR),
                Enter.theValue(data.get(0).getStrLanguagePage()).into(INPUT_LANGUAGE_PAGE),
                Hit.the(Keys.ENTER).into(INPUT_LANGUAGE_PAGE),
                Click.on(BUTTON_LOCATION));
    }

}
