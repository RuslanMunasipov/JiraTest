package PageObject.Jira;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.conditions.Text;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.page;
import static sun.management.Agent.getText;

public class SecondPage extends LoginForm {
        @FindBy(how = How.XPATH, using = "//a[@id='browse_link']")
        private SelenideElement browseLink;

        @FindBy(how = How.XPATH, using = "//a[@id='admin_main_proj_link_lnk']")
        private SelenideElement mainProj;

        @FindBy(how = How.XPATH, using = "//a[text()='Посмотреть все задачи и фильтры']")
        private SelenideElement allTasks;

        @FindBy (how = How.XPATH, using = "//span[starts-with(text(), '1')]")
        private SelenideElement findText;

        @FindBy (how = How.XPATH, using = "//input[@class = 'search-entry text medium-field ajs-dirty-warning-exempt']")
        private SelenideElement enterTextElement;

        @FindBy (how = How.XPATH, using = "//span[@class = ' jira-issue-status-lozenge aui-lozenge jira-issue-status-lozenge-blue-gray jira-issue-status-lozenge-new jira-issue-status-lozenge-max-width-medium']")
        private SelenideElement checkStatus;

        @FindBy (how = How.XPATH, using = "//span[@class = 'shorten']/a")
        private SelenideElement versionCheck;

        public ThirdPage clickToBrowse(){
            browseLink.click();
            return page(ThirdPage.class);
        }
        public ThirdPage clickToMainProj(){
            mainProj.click();
            return page(ThirdPage.class);
        }
        public ThirdPage clickToAllTasks(){
            allTasks.click();
            return page(ThirdPage.class);
        }
        public ThirdPage findText(){
            SelenideElement mess = findText;
            mess.shouldHave(text("1"));
            System.out.println("Количество тестов :" + " " + mess.getText());
            return page(ThirdPage.class);
        }
        public ThirdPage enterText(){
            enterTextElement.click();
            enterTextElement.setValue("TestSelenium").pressEnter();
            return page(ThirdPage.class);
        }
        public ThirdPage checkingStatus() {
            checkStatus.shouldBe(visible);
            return page(ThirdPage.class);
        }
    public ThirdPage checkingVersion() {
        versionCheck.shouldBe(visible);
        return page(ThirdPage.class);
    }

}
