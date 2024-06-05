import Core.BrowserHelper;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class HerokuApp {

    public WebDriver driver;
    @Test
    public void herokuApp() throws InterruptedException {
        BrowserHelper bh = new BrowserHelper();
        driver = bh.chrome();

        WebElement dismiss = new WebDriverWait(driver, Duration.ofSeconds(10)).
                until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'Dismiss')]")));
        dismiss.click(); //click on dismiss using explicit wait

        WebElement search = new WebDriverWait(driver, Duration.ofSeconds(10)).
                until(ExpectedConditions.elementToBeClickable(By.xpath("//mat-icon[contains(text(),'search')]")));


        //check search button is displayed or not
        if(search.isDisplayed() && search.isEnabled()){
            System.out.println("Test Passed: Search button is displayed");
            search.click();
            WebElement search1 = new WebDriverWait(driver, Duration.ofSeconds(10)).
                    until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='mat-input-0']")));
            search1.sendKeys("Apple");
            search1.sendKeys(Keys.ENTER);

        }
        else {
            System.out.println("Test Failed: Search button not displayed");
        }

        //list of web element of apples using explicit wait
        List<WebElement> apples = new WebDriverWait(driver, Duration.ofSeconds(10)).
                until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//div[contains(text(),'Apple')]")));
        driver.findElements(By.xpath("//div[contains(text(),'Apple')]"));

        System.out.println("Apple size "+apples.size()); //total sizes of apples
        if(apples.size() == 2){
            System.out.println("Test Passed: 2 Apples are shown");

        }
        else {
            System.out.println("Test failed: 2 Apples not shown");
        }

        //list of web element of bananas
        List<WebElement> bananas = driver.findElements(By.xpath("//div[contains(text(),'banana')]"));

        if(bananas.isEmpty()){
            System.out.println("Test Passed: No bananas are shown");
        }
        else {
            System.out.println("Test failed: Bananas are shown");
        }


    }
}
