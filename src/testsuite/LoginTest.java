package testsuite;
/**
 * 3. Write down the following test into ‘LoginTest’ class
 * 1. userShouldNavigateToLoginPageSuccessfully
 * * click on the ‘Login’ link
 * * Verify the text ‘Welcome, Please Sign
 * In!’
 * 2. userShouldLoginSuccessfullyWithValidCredentials
 * * click on the ‘Login’ link
 * * Enter valid username
 * * Enter valid password
 * * Click on ‘LOGIN’ button
 * * Verify the ‘Log out’ text is display
 * 3. verifyTheErrorMessage
 * * click on the ‘Login’ link
 * * Enter invalid username
 * * Enter invalid password
 * * Click on Login button
 * * Verify the error message ‘Login was unsuccessful.
 * Please correct the errors and try again. No customer account found’
 */

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginTest extends BaseTest {

    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setUp(){
        openBrowser(baseUrl);
    }
    @Test
    public void userShouldNavigateToLoginSuccessfully(){
        //find the login link and click on the link
        WebElement loginLink = driver.findElement(By.linkText("Log in"));
        loginLink.click();
        String expectedText = "Welcome, Please Sign In!";
        String actualText = driver.findElement(By.tagName("h1")).getText();
        Assert.assertEquals("Not redirected to Login page", expectedText,actualText);
    }
    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials(){
        //find the login link and click on the link
        WebElement loginLink = driver.findElement(By.linkText("Log in"));
        loginLink.click();
        //find the Email field and Enter Valid Email address
        WebElement emailField = driver.findElement(By.id("Email"));
        emailField.sendKeys("jasmeen144@gmail.com");
        //find the password field and enter the Valid password
        WebElement passwordField = driver.findElement(By.name("Password"));
        passwordField.sendKeys("jk1234");
        //Click on 'login' button
        driver.findElement(By.xpath("//button[@class = 'button-1 login-button']")).click();
        //Verify the 'Log Out' text is display
        String expectedText = "Log out";
        String actualText = driver.findElement(By.xpath("//a[@class = 'ico-logout']")).getText();
        Assert.assertEquals("Log Out text not displayed correctly", expectedText, actualText);
    }
    @Test
    public void verifyTheErrorMessage(){
        //find the login link and click on it
        WebElement loginLink = driver.findElement(By.linkText("Log in"));
        loginLink.click();
        //find the Email field and enter the invalid email address
        WebElement emailField = driver.findElement(By.id("Email"));
        emailField.sendKeys("scrum1@gmail.com");
        //find the password field and enter the invalid password
        WebElement passwordField = driver.findElement(By.name("Password"));
        passwordField.sendKeys("scrum123");
        //Click on 'login' button
        driver.findElement(By.xpath("//button[@class = 'button-1 login-button']")).click();
        //Verify the error message
        String expectedMessage = "Login was unsuccessful. Please correct the errors and try again.\n" +
                "No customer account found";
        String actualMessage = driver.findElement(By.xpath("//div[@class = 'message-error validation-summary-errors']")).getText();
        Assert.assertEquals("Error message not displayed", expectedMessage, actualMessage);
    }
    @After
    public void tearDown(){
        closeBrowser();
    }
}
