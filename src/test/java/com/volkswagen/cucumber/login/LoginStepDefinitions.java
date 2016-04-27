package com.volkswagen.cucumber.login;

import com.volkswagen.lib.LoginPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.java.en.And;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import static org.hamcrest.CoreMatchers.endsWith;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class LoginStepDefinitions {

    private WebDriver driver;
    private String userName, passWord;
    private LoginPage loginPage;
    //LoginPage loginPage = new LoginPage(driver);


    @Given("^I am on the sign in page$")
    public void iAmOnTheSignInPage() throws Throwable {
        driver = new FirefoxDriver();
        //this.loginPage = loginPage;
        driver.navigate().to("https://www.volkswagen.co.uk/owners/my");

        //Assert.assertTrue("title should be blah",driver.getTitle().startsWith("Login : Volkswagen UK"));
    }

//    public SomeStepDefs(LoginPage loginPage) {
//        this.loginPage = loginPage;
//    }

    @When("^I type into username field : '(.*)'$") //'automatedtestdragon-A(\\d+)@example\.com'$")
    public void iTypeIntoUsernameFieldAutomatedtestdragonAExampleCom(String userName) throws Throwable {
        this.userName = userName;
        loginPage = new LoginPage(driver);

            loginPage.typeUserName(this.userName);



    }

    @And("^I type into password field : '(.*)'$") //'Abcd!(\\d+)'$")
    public void iTypeIntoPasswordFieldAbcd(String passWord) throws Throwable {
        this.passWord = passWord;
        loginPage = new LoginPage(driver);
        loginPage.typePassword(this.passWord);
    }

    @And("^press login$")
    public void pressLogin() throws Throwable {
       loginPage = new LoginPage(driver);
       loginPage.signIn();
    }

    @Then("^I should be able to log in$")
    public void iShouldBeAbleToLogIn() throws Throwable {
        driver.quit();
    }


}
