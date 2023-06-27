package testsuite;
/**
 * 5. Write down the following test into ‘RegisterTest’
 * class
 * 1. userShouldNavigateToRegisterPageSuccessfully
 * * click on the ‘Register’ link
 * * Verify the text ‘Register’
 * 2. userShouldRegisterAccountSuccessfully
 * * click on the ‘Register’ link
 * * Select gender radio button
 * * Enter First name
 * * Enter Last name
 * * Select Day Month and Year
 * * Enter Email address
 * * Enter Password
 * * Enter Confirm password
 * * Click on REGISTER button
 */

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

public class RegisterTest extends BaseTest {

    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setUp(){

        openBrowser(baseUrl);
    }
    @Test
    public void userShouldNavigateToRegisterPageSuccessfully(){
        //click in the 'Register' link
        driver.findElement(By.xpath("//a[text() = 'Register']")).click();
        //verify the text 'Register'
        String expectedText = "Register";
        String actualText = driver.findElement(By.tagName("h1")).getText();
        Assert.assertEquals("Register text is not correct", expectedText, actualText);
    }
    @Test
    public void userShouldRegisterAccountSuccessfully(){
        //click on the ‘Register’ link
        driver.findElement(By.xpath("//a[text() = 'Register']")).click();
        //Select gender radio button
        driver.findElement(By.id("gender-female")).click();
        //Enter First name
        driver.findElement(By.id("FirstName")).sendKeys("Jasmeen");
        //Enter Last name
        driver.findElement(By.id("LastName")).sendKeys("Kaur");
        //Select Day Month and Year
        driver.findElement(By.name("DateOfBirthDay")).sendKeys("2");
        driver.findElement(By.name("DateOfBirthMonth")).sendKeys("2");
        driver.findElement(By.name("DateOfBirthYear")).sendKeys("1985");
        //Enter Email address
        driver.findElement(By.id("Email")).sendKeys("jasmeen144@gmail.com");
        //Enter Password
        driver.findElement(By.id("Password")).sendKeys("jk1234");
        //Enter Confirm password
        driver.findElement(By.id("ConfirmPassword")).sendKeys("jk1234");
        //Click on REGISTER button
        driver.findElement(By.name("register-button")).click();
        //Verify the text 'Your registration completed’
        String expectedText = "Your registration completed";
        String actualText = driver.findElement(By.name("__RequestVerificationToken")).getText();
        Assert.assertEquals("Your registration completed is not correct", expectedText, actualText);

    }
    @After
    public void tearDown(){
        closeBrowser();
    }

}
