package Util;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Sleeper;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Clock;
import java.time.Duration;

public class ElementHelper {
    WebDriver driver;
    WebDriverWait wait;
    Actions action;

    public ElementHelper(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Clock.systemDefaultZone(), Sleeper.SYSTEM_SLEEPER,10,500L);
        this.action = new Actions(driver);
    }

    public WebElement presenceElement(By key){
        return wait.until(ExpectedConditions.presenceOfElementLocated(key));
    }
    public WebElement findElement(By key){
        WebElement element = presenceElement(key);
        return element;
    }
    public void click(By key){
        findElement(key).click();
    }
    public void sendKey(By key, String text){
        findElement(key).sendKeys(text);
    }
    public void checkVisible(By key){
        wait.until(ExpectedConditions.visibilityOf(findElement(key)));
    }

    public void sendKeys(Keys enter,By key, String text) {
        sendKey(key, text);
    }
    public void setWait(int milisaniye){
        try {
            Thread.sleep(milisaniye);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
