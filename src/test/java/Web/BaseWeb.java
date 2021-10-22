package Web;

import PageObject.Jira.LoginForm;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.page;

public class BaseWeb {
    public static void login(){
        open("https://edujira.ifellow.ru/secure/Dashboard.jspa", LoginForm.class)
                .loginVal("rmunasipov")
                .passwordVal("123qaz!@#QAZ")
                .clickButtonLogIn();
    }
    public static void secondPageBrowse(){
        open("https://edujira.ifellow.ru/secure/Dashboard.jspa", LoginForm.class)
                .loginVal("rmunasipov")
                .passwordVal("123qaz!@#QAZ")
                .clickButtonLogIn()
                .clickToBrowse()
                .clickToMainProj()
                .clickToAllTasks()
                .findText()
                .enterText()
                .checkingStatus()
                .checkingVersion();
    }
    public static void thirdPageBrowse(){
        open("https://edujira.ifellow.ru/secure/Dashboard.jspa", LoginForm.class)
                .loginVal("rmunasipov")
                .passwordVal("123qaz!@#QAZ")
                .clickButtonLogIn()
                .clickToBrowse()
                .clickToMainProj()
                .clickToAllTasks()
                .findText()
                .enterText()
                .checkingStatus()
                .checkingVersion()
                .clickToCreateNewTask()
                .setIssueType()
                .setErrorTheme()
                .setErrInfo()
                .setOption()
                .setPriority()
                .setHashTag()
                .setMoreInfo()
                .clickToAssignMe()
                .clickSubmit();
    }
    public static void fourthPageBrowse(){
        open("https://edujira.ifellow.ru/secure/Dashboard.jspa", LoginForm.class)
                .loginVal("rmunasipov")
                .passwordVal("123qaz!@#QAZ")
                .clickButtonLogIn()
                .clickToBrowse()
                .clickToMainProj()
                .clickToAllTasks()
                .findText()
                .enterText()
                .checkingStatus()
                .checkingVersion()
                .clickToCreateNewTask()
                .setIssueType()
                .setErrorTheme()
                .setErrInfo()
                .setOption()
                .setPriority()
                .setHashTag()
                .setMoreInfo()
                .clickToAssignMe()
                .clickSubmit()
                .clickToFindTask()
                .clickToCheckStatus()
                .clickToSetReady()
                .clickToCheckFinalStatus()
                .clickCommentaryBtn();
    }
}
