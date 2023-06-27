package testsuite;
/**
 * 4. Write down the following test into ‘TopMenuTest’ class
 * 1. userShouldNavigateToComputerPageSuccessfully
 *
 * * click on the ‘Computers’ Tab
 * * Verify the text ‘Computers’
 *
 * 2. userShouldNavigateToElectronicsPageSuccessfully
 *
 * * click on the ‘Electronics’ Tab
 * * Verify the text ‘Electronics’
 *
 * 3. userShouldNavigateToApparelPageSuccessfully
 *
 * * click on the ‘Apparel’ Tab
 * * Verify the text ‘Apparel’
 *
 * 4.
 * userShouldNavigateToDigitalDownloadsPageSuccessfully
 * * click on the ‘Digital downloads’ Tab
 * * Verify the text ‘Digital downloads’
 * 5. userShouldNavigateToBooksPageSuccessfully
 *
 * * click on the ‘Books’ Tab
 * * Verify the text ‘Books’
 *
 * 6. userShouldNavigateToJewelryPageSuccessfully
 *
 * * click on the ‘Jewelry’ Tab
 * * Verify the text ‘Jewelry’
 *
 * 7. userShouldNavigateToGiftCardsPageSuccessfully
 *
 * * click on the ‘Gift Cards’ Tab
 * * Verify the text ‘Gift Cards’
 */

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TopMenuTest extends BaseTest {
    String baseUrl = "https://demo.nopcommerce.com/";
    @Before
    public void setUp(){

        openBrowser(baseUrl);
    }
    @Test
    public void userShouldNavigateToComputerPageSuccessfully(){
        //Click on the 'Computers' Tab
        driver.findElement(By.xpath("//ul[@class = 'top-menu notmobile']//a[text() = 'Computers ']")).click();
        //Verify the text 'Computers'
        String expectedText = "Computers";
        String actualText = driver.findElement(By.xpath("//h1[text() = 'Computers']")).getText();
        Assert.assertEquals("Computers text not correct", expectedText, actualText);
    }
    @Test
    public void userShouldNavigateToElectronicsPageSuccessfully(){
        //Click on the 'Electronics' Tab
        driver.findElement(By.xpath("//ul[@class = 'top-menu notmobile']//a[text() = 'Electronics ']")).click();
        //Verify the text 'Electronics'
        String expectedText = "Electronics";
        String actualText = driver.findElement(By.xpath("//h1[text() = 'Electronics']")).getText();
        Assert.assertEquals("Electronics text is not correct", expectedText, actualText);
    }
    @Test
    public void userShouldNavigateToApparelPageSuccessfully(){
        //Click on the 'Apparel' Tab
        driver.findElement(By.xpath("//ul[@class = 'top-menu notmobile']//a[text() = 'Apparel ']")).click();
        //Verify the text 'Apparel'
        String expectedText = "Apparel";
        String actualText = driver.findElement(By.xpath("//h1[text() = 'Apparel']")).getText();
        Assert.assertEquals("Apparel text is not correct", expectedText, actualText);
    }
    @Test
    public void userShouldNavigateToDigitalDownloadsPageSuccessfully(){
        //Click on the ‘Digital downloads’ Tab
        driver.findElement(By.xpath("//ul[@class = 'top-menu notmobile']//a[text() = 'Digital downloads ']")).click();
        //Verify the text 'Digital downloads'
        String expectedText = "Digital downloads";
        String actualText = driver.findElement(By.xpath("//h1[text() = 'Digital downloads']")).getText();
        Assert.assertEquals("Digital downloads text is not correct", expectedText, actualText);
    }
    @Test
    public void userShouldNavigateToBooksPageSuccessfully(){
        //Click on the ‘Books’ Tab
        driver.findElement(By.xpath("//ul[@class = 'top-menu notmobile']//a[text() = 'Books ']")).click();
        //Verify the text 'Books'
        String expectedText = "Books";
        String actualText = driver.findElement(By.xpath("//h1[text() = 'Books']")).getText();
        Assert.assertEquals("Books text is not correct", expectedText, actualText);
    }
    @Test
    public void userShouldNavigateToJewelryPageSuccessfully(){
        //Click on the ‘Jewelry’ Tab
        driver.findElement(By.xpath("//ul[@class = 'top-menu notmobile']//a[text() = 'Jewelry ']")).click();
        //Verify the text 'Jewelry'
        String expectedText = "Jewelry";
        String actualText = driver.findElement(By.xpath("//h1[text() = 'Jewelry']")).getText();
        Assert.assertEquals("Jewelry text is not correct", expectedText, actualText);

    }
    @Test
    public void userShouldNavigateToGiftCardsPageSuccessfully(){
        //Click on the ‘Gift Cards’ Tab
        driver.findElement(By.xpath("//ul[@class = 'top-menu notmobile']//a[text() = 'Gift Cards ']")).click();
        //Verify the text 'Gift Cards'
        String expectedText = "Gift Cards";
        String actualText = driver.findElement(By.xpath("//h1[text() = 'Gift Cards']")).getText();
        Assert.assertEquals("Gift Cards text is not correct", expectedText, actualText);

    }
    @After
    public void tearDown(){
        closeBrowser();
    }



}
