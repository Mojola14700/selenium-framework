package com.testing.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateAccountPagePO {


    // Element locator - stage 1
    @FindBy(id = "firstname")
    public static WebElement FirstNameField;

    @FindBy(id = "lastname")
    public static WebElement LastNameField;

    @FindBy(id = "email_address")
    public static WebElement EmailField;

    @FindBy(id = "password")
    public static WebElement PasswordField;

    @FindBy(id = "password-confirmation")
    public static WebElement PasswordConfirmationField;

    @FindBy(css = "#form-validate > div > div.primary > button > span")
    public static WebElement CreateAccountButton;




    // Initialise web elements using selenium webdriver - Stage 2
    public CreateAccountPagePO(WebDriver driver){
        PageFactory.initElements(driver, this);
    }


    //Page specific method - stage 3
    public void enterFirstName(String Firstname){
        FirstNameField.sendKeys(Firstname);

    }


    public void enterLastName(String Lastname){
        LastNameField.sendKeys(Lastname);

    }

    public void enterEmailAddress(String email){
        EmailField.sendKeys(email);


    }


    public void enterPassword(String Password){
        PasswordField.sendKeys(Password);


    }


    public void enterConfirmPassword(String ConfirmPassword){
        PasswordConfirmationField.sendKeys(ConfirmPassword);

    }

    public void clickCreateAccountButton(){
        CreateAccountButton.click();
    }























}
