package co.com.choucair.utest.tasks;

import co.com.choucair.utest.model.UtestData;
import co.com.choucair.utest.userinterface.LocationDataPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import org.openqa.selenium.Keys;

import java.util.List;

import static co.com.choucair.utest.userinterface.LocationDataPage.*;

public class FillOutTheLocationData implements Task {

    private List<UtestData> data;

    public FillOutTheLocationData(List<UtestData> data) {
        this.data = data;
    }

    public static FillOutTheLocationData onThePage(List<UtestData> data) {
        return Tasks.instrumented(FillOutTheLocationData.class, data);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(data.get(0).getStrCity()).into(INPUT_CITY),
                Hit.the(Keys.ARROW_DOWN).into(INPUT_CITY),
                Hit.the(Keys.ENTER).into(INPUT_CITY),
                Enter.theValue(data.get(0).getStrZip()).into(INPUT_ZIP),
                Click.on(SELECT_COUNTRY),
                Enter.theValue(data.get(0).getStrCountry()).into(INPUT_COUNTRY),
                Click.on(BUTTON_DEVICES));
    }
}
