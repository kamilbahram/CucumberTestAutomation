package Pages;

import Util.ElementHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static java.time.Duration.ofSeconds;

public class LoginPages {
    static WebDriver driver;
    static ElementHelper elementHelper;
    WebDriverWait wait;
    static String email = "kamilbhrm@gmail.com";
    static String accountEmail = "kamilbahram45645@gmail.com";
    static String password = "Kamil.1461";
    static By mainGiris = By.xpath("//*[@id=\"home\"]/nav/div/div[1]/ul/li[2]/a");
    static By emailXpath = By.xpath("//*[@id=\"loginForm\"]/div[2]/input");
    static By passwordXpath = By.xpath("//*[@id=\"id_password\"]");
    static By noRobotCheckBox = By.xpath("//*[@id=\"id_captcha\"]");
    static By userLoginXpath = By.xpath("//*[@id=\"kt_sign_in_submit\"]");
    static By isEqualDashboard = By.xpath("//*[@id=\"kt_toolbar_container\"]/div/ul/li[1]/a");
    static By accountCreateXpath = By.xpath("//*[@id=\"loginForm\"]/div[1]/div/a");
    static By accountCreateEmailXpath = By.xpath("//*[@id=\"id_email\"]");
    static By accountCreatePasswordXpath = By.xpath("//*[@id=\"id_password1\"]");
    static By accountCreatePasswordAgainXpath = By.xpath("//*[contains(@name,'password2')]");

    static By register = By.xpath("//*[@id=\"kt_sign_in_submit\"]");
    static By mailVerificationXpath = By.xpath("//*[@id=\"kt_body\"]/div/div[1]/div/div/h1");
    static By resetPasswordClick = By.xpath("//*[@id=\"loginForm\"]/div[3]/div[1]/a");
    static By resetPasswordEmailSend = By.xpath("//*[@id=\"loginForm\"]/div[2]/input");
    static By resetEmailClick = By.xpath("//*[@id=\"kt_sign_in_submit\"]");
    static By resetPasswordEmailVerification = By.xpath("//*[@id=\"kt_body\"]/div/div[1]/div/div/h1");
    static By userButton = By.cssSelector("#kt_header_user_menu_toggle > div.btn.btn-icon.btn-color-gray-700.btn-active-color-success.btn-outline.btn-outline-secondary.w-30px.h-30px.w-lg-40px.h-lg-40px > span");
    static By logOutButton = By.xpath("//*[@id=\"kt_header_user_menu_toggle\"]/div[2]/div[6]/a");
    static By yesButton = By.xpath("//*[@id=\"kt_body\"]/div[2]/div/div[6]/button[1]");
    static By outEnable = By.xpath("//*[@id=\"home\"]/nav/div/div[1]/ul/li[2]/a");

    public LoginPages(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver,10);
        this.elementHelper = new ElementHelper(driver);
    }
    public void girisButonunaBas() {
        elementHelper.click(mainGiris);
    }
     public void epostaSifreGirVeDogrulamaKutucugunuIsaretle() {
        elementHelper.sendKey(emailXpath,email);
        elementHelper.sendKey(passwordXpath,password);
        elementHelper.click(noRobotCheckBox);
    }
    public void uyeGirisButonunaBas() {
        elementHelper.click(userLoginXpath);
    }
    public void girisYapildiMi() {
        elementHelper.checkVisible(isEqualDashboard);
    }

    public void hesapOluşturButonunaBas() {
        elementHelper.click(accountCreateXpath);
    }

    public void epostaSifreSifreTekrarGirVeDogrulamaKutucugunuIsaretle() {
        elementHelper.sendKey(accountCreateEmailXpath,accountEmail);
        elementHelper.sendKey(accountCreatePasswordXpath,password);
        elementHelper.sendKey(accountCreatePasswordAgainXpath,password);
        elementHelper.click(noRobotCheckBox);
    }

    public void kaydolButonunaBas() {
        elementHelper.setWait(2000);
        elementHelper.click(register);
    }
    public void dogrulamaMailGonderildiMi() {
        elementHelper.checkVisible(mailVerificationXpath);
    }
    // Sifre sıfırlama mail gönderme
    public void sifremiUnuttumButonunaBas() {
        elementHelper.click(resetPasswordClick);
    }
    public void sifirlamaMailGonderildiMi() {
        elementHelper.checkVisible(resetPasswordEmailVerification);
    }

    public void sifirlamaMailGonderButonunaBas() {
        elementHelper.setWait(2000);
        elementHelper.click(resetEmailClick);
    }

    public void epostaGirVeDogrulamaKutucugunuIsaretle() {
        elementHelper.sendKey(resetPasswordEmailSend,email);
        elementHelper.click(noRobotCheckBox);
    }


    public void kullaniciButonunaBasilir() {
        elementHelper.click(userButton);
    }

    public void cikisButonunaBasilir() {
        elementHelper.click(logOutButton);
    }

    public void evetEminimButonunaBasilir() {
        elementHelper.click(yesButton);
    }

    public void cikisYapildimi() {
        elementHelper.checkVisible(outEnable);
    }
}
