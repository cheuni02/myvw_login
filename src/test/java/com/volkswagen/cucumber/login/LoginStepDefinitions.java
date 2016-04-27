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


    @Given("^I am on the sign in page$")
    public void iAmOnTheSignInPage() throws Throwable {
        driver = new FirefoxDriver();
        driver.navigate().to("https://www.volkswagen.co.uk/owners/my");

        //Assert.assertTrue("title should be blah",driver.getTitle().startsWith("Login : Volkswagen UK"));
    }

    @When("^I type into username field : '(.*)'$") //'automatedtestdragon-A(\\d+)@example\.com'$")
    public void iTypeIntoUsernameFieldAutomatedtestdragonAExampleCom(String userName) throws Throwable {
        this.userName = userName;
        LoginPage loginpage = new LoginPage(driver);
        loginpage.typeUserName(this.userName);
    }

    @And("^I type into password field : '(.*)'$") //'Abcd!(\\d+)'$")
    public void iTypeIntoPasswordFieldAbcd(String passWord) throws Throwable {
        this.passWord = passWord;
        LoginPage loginpage = new LoginPage(driver);
        loginpage.typePassword(this.passWord);
    }

    @And("^press login$")
    public void pressLogin() throws Throwable {
        LoginPage loginpage = new LoginPage(driver);
        loginpage.signIn();
    }

    @Then("^I should be able to log in$")
    public void iShouldBeAbleToLogIn() throws Throwable {
    }


}
