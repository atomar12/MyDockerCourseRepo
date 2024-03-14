package generic_keywords;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WebElementsInteractions
{
    protected WebDriver driver;

    //Custom Keywords that helps to implement KeyWord Driven Framework Strategy
    protected WebElementsInteractions(WebDriver driver)
    {
        this.driver = driver;
    }
    protected void clickElement(By locator)
    {
        driver.findElement(locator).click();
    }

    protected void sendText(By locator, String text)
    {
        driver.findElement(locator).sendKeys(text);
    }

    protected void goToApplication(String url)
    {
        driver.get(url);
    }

    protected String retrieveTextData(By locator)
    {
        return driver.findElement(locator).getText();
    }

}
