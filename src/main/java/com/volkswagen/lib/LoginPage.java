package com.volkswagen.lib;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


/**
 * Created by ivan.cheung on 4/25/2016.
 */
public class LoginPage {
    private final WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void typeUserName (String userName){
        WebElement username = driver.findElement(By.id("username"));
        username.sendKeys(userName);
    }

    public void typePassword (String password){
        WebElement username = driver.findElement(By.id("password"));
        username.sendKeys(password);
    }

    public void signIn(){
        WebElement submitbutton = driver.findElement(By.id("login-button"));
        submitbutton.click();
    }


    public boolean loginConfirmationMessagePresent(){
        WebElement messageHolder;

        try{
            messageHolder = driver.findElement(By.className("no-sub"));
        }catch(NoSuchElementException e){
            return false;
        }

        if(!messageHolder.isDisplayed()){
            return false;
        }

        if(!messageHolder.getText().startsWith("Welcome")){
            return true;
        }

        return true;
    }

}
