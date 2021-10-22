package WebSteps;

import Hooks.WebHooks;
import PageObject.Jira.SecondPage;
import org.junit.jupiter.api.Test;

import static Web.BaseWeb.*;


public class FirstTest extends WebHooks {
    @Test
    public void loginIn() {
        login();
    }

    @Test
    public void secondPageTest(){
        secondPageBrowse();
    }


    @Test
    public void thirdPageTest() {
        thirdPageBrowse();
    }
    @Test
    public void fourthPageTest() {
        fourthPageBrowse();
    }




}

