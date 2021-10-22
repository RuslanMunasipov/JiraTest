package PageObject.Jira;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static com.codeborne.selenide.Selenide.page;


public class LoginForm {
    @FindBy(how = How.XPATH, using = "//input[@id='login-form-username']")
    private SelenideElement LoginJira;

    @FindBy(how = How.XPATH, using = "//input[@id='login-form-password']")
    private SelenideElement PasswordJira;

    @FindBy(how = How.XPATH, using = "//input[@value='Войти']")
    private SelenideElement buttonLogIn;

    public SecondPage loginVal(String loginName) {
        LoginJira.setValue(loginName);
        return page(SecondPage.class);
    }
    public SecondPage passwordVal(String passwordName) {
        PasswordJira.setValue(passwordName);
        return page(SecondPage.class);
    }
    public SecondPage clickButtonLogIn(){
        buttonLogIn.click();
        return page(SecondPage.class);
    }
}
