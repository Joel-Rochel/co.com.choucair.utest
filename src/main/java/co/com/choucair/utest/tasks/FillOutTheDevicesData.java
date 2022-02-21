package co.com.choucair.utest.tasks;

import co.com.choucair.utest.model.UtestData;
import co.com.choucair.utest.userinterface.DevicesDataPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import org.openqa.selenium.Keys;

import java.util.List;

import static co.com.choucair.utest.userinterface.DevicesDataPage.*;

public class FillOutTheDevicesData implements Task {

    private List<UtestData> data;

    public FillOutTheDevicesData(List<UtestData> data) {
        this.data = data;
    }

    public static FillOutTheDevicesData onThePage(List<UtestData> data) {
        return Tasks.instrumented(FillOutTheDevicesData.class, data);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(SELECT_COMPUTER),
                Enter.theValue(data.get(0).getStrComputer()).into(INPUT_COMPUTER),
                Hit.the(Keys.ENTER).into(INPUT_COMPUTER),
                Click.on(SELECT_VERSION),
                Enter.theValue(data.get(0).getStrVersion()).into(INPUT_VERSION),
                Hit.the(Keys.ENTER).into(INPUT_VERSION),
                Click.on(SELECT_LANGUAGE),
                Enter.theValue(data.get(0).getStrLanguage()).into(INPUT_LANGUAGE),
                Hit.the(Keys.ENTER).into(INPUT_LANGUAGE),
                Click.on(SELECT_MOBILE),
                Enter.theValue(data.get(0).getStrMobile()).into(INPUT_MOBILE),
                Hit.the(Keys.ENTER).into(INPUT_MOBILE),
                Click.on(SELECT_MODEL),
                Enter.theValue(data.get(0).getStrModel()).into(INPUT_MODEL),
                Hit.the(Keys.ENTER).into(INPUT_MODEL),
                Click.on(SELECT_OS),
                Enter.theValue(data.get(0).getStrOS()).into(INPUT_OS),
                Hit.the(Keys.ENTER).into(INPUT_OS),
                Click.on(BUTTON_LASTSTEP));
    }
}
