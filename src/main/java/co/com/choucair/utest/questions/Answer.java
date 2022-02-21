package co.com.choucair.utest.questions;

import co.com.choucair.utest.model.UtestData;
import co.com.choucair.utest.userinterface.CredentialsDataPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import java.util.List;

public class Answer implements Question<Boolean> {

    private List<UtestData> data;

    public Answer(List<UtestData> data) {
        this.data = data;
    }

    public static Answer toThe(List<UtestData> data) {
        return new Answer(data);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean result;
        String confirm_button = Text.of(CredentialsDataPage.BUTTON_COMPLETE).viewedBy(actor).asString();
        result = data.get(0).getStrConfirmButton().equals(confirm_button)?true:false;
        return result;
    }
}
