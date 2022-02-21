package co.com.choucair.utest.tasks;

import co.com.choucair.utest.model.UtestData;
import co.com.choucair.utest.userinterface.CredentialsDataPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.List;

import static co.com.choucair.utest.userinterface.CredentialsDataPage.*;

public class FillOutTheCredentialsData implements Task {

    private List<UtestData> data;

    public FillOutTheCredentialsData(List<UtestData> data) {
        this.data = data;
    }

    public static FillOutTheCredentialsData onThePage(List<UtestData> data) {
        return Tasks.instrumented(FillOutTheCredentialsData.class, data);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(data.get(0).getStrPassword()).into(INPUT_PASSWORD),
                Enter.theValue(data.get(0).getStrPassword()).into(INPUT_CONFIRM_PASSWORD),
                Click.on(CHECKBOX_INFORMED),
                Click.on(CHECKBOX_TERMS),
                Click.on(CHECKBOX_PRIVACY),
                Click.on(BUTTON_COMPLETE));
    }
}
