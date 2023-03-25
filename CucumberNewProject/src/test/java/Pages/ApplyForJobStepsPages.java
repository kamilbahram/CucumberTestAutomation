package Pages;

import Util.ElementHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ApplyForJobStepsPages {
    static WebDriver driver;
    static ElementHelper elementHelper;
    WebDriverWait wait;
    String positionsName = "Ağırlık ve Denge Mühendisi";
    static String email = "kamilbhrm@gmail.com";
    static String password = "***********";
    static By openPositionsMenu = By.xpath("//*[@id=\"navbar-menu\"]/ul/li[2]/a");
    static By getOpenPositions =By.cssSelector("body > div > a > button");
    static By allOpenPositionsButton = By.xpath("//*[@id=\"services\"]/div[3]/div/div/div/a");
    static By positionsNameXPath = By.xpath("//*[@id=\"myInput\"]");
    static By applyButton = By.xpath("//*[@id=\"myUL\"]/li/div/div[3]/button");
    static By emailXpath = By.xpath("//*[@id=\"loginForm\"]/div[2]/input");
    static By passwordXpath = By.xpath("//*[@id=\"id_password\"]");
    static By noRobotCheckBox = By.xpath("//*[@id=\"id_captcha\"]");
    static By userLoginXpath = By.xpath("//*[@id=\"kt_sign_in_submit\"]");
    static By findBoxPositions = By.xpath("//*[@id=\"kt_header\"]/div[1]/div[2]/div/div/div/div[2]/form/input[3]");
    static By getGetOpenPositions = By.cssSelector("#kt_toolbar_container > div > div.col-xl-8 > div > div > div > a");

    static By applyButton2 = By.cssSelector("#myUL > li > div > div.position-process > button");
    static By onay = By.cssSelector("#swal2-title");
    public ApplyForJobStepsPages(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver,10);
        this.elementHelper = new ElementHelper(driver);
    }
    public void acikPozisyonlarMenusunaBas() {
        elementHelper.click(openPositionsMenu);
    }
    public void tumAcikPozisyonlarButonunaBas() {
        elementHelper.click(getOpenPositions);
    }
    public void basvuruAraAlaninaBasVePozisyonIsminiGiriniz() {
        elementHelper.sendKey(positionsNameXPath,positionsName);
    }
    public void epostaSifreGirVeDogrulamaKutucugunuIsaretle() {
        elementHelper.sendKey(emailXpath,email);
        elementHelper.sendKey(passwordXpath,password);
        elementHelper.click(noRobotCheckBox);
        elementHelper.setWait(2000);

    }

    public void girisButonunaBas() {
        elementHelper.click(userLoginXpath);
    }
    public void acikPozisyonlarButonunaBas() {
        elementHelper.click(getGetOpenPositions);
    }
    public void basvuruButonunaBas() {
        elementHelper.click(applyButton2);
    }
    public void basvuruOnay() {
        elementHelper.checkVisible(onay);
    }


}
