package StepDefinitions;

import Pages.LoginPages;
import Util.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class LoginSteps {
    WebDriver driver = DriverFactory.getDriver();
    LoginPages loginPages = new LoginPages(driver);

    @When("Giris butonuna bas")
    public void girisButonunaBas() {
        loginPages.girisButonunaBas();
    }

    @When("Eposta Sifre gir ve dogrulama kutucugunu isaretle")
    public void epostaSifreGirVeDogrulamaKutucugunuIsaretle() {
        loginPages.epostaSifreGirVeDogrulamaKutucugunuIsaretle();
    }

    @When("Uye Giris butonuna bas")
    public void uyeGirisButonunaBas() {
        loginPages.uyeGirisButonunaBas();
    }

    @Then("Giris yapildi mi")
    public void girisYapildiMi() {
        loginPages.girisYapildiMi();
    }

    @When("Hesap Oluştur butonuna bas")
    public void hesapOluşturButonunaBas() {
        loginPages.hesapOluşturButonunaBas();
    }

    @When("Eposta Sifre Sifre\\(Tekrar) gir ve dogrulama kutucugunu isaretle")
    public void epostaSifreSifreTekrarGirVeDogrulamaKutucugunuIsaretle() {
        loginPages.epostaSifreSifreTekrarGirVeDogrulamaKutucugunuIsaretle();
    }

    @When("Kaydol butonuna bas")
    public void kaydolButonunaBas() {
        loginPages.kaydolButonunaBas();
    }

    @Then("Dogrulama mail gonderildi mi")
    public void dogrulamaMailGonderildiMi() {
        loginPages.dogrulamaMailGonderildiMi();
    }

    @When("Sifremi unuttum butonuna bas")
    public void sifremiUnuttumButonunaBas() {
        loginPages.sifremiUnuttumButonunaBas();
    }

    @When("Eposta gir ve dogrulama kutucugunu isaretle")
    public void epostaGirVeDogrulamaKutucugunuIsaretle() {
        loginPages.epostaGirVeDogrulamaKutucugunuIsaretle();
    }


    @When("Sifirlama mail gonder butonuna bas")
    public void sifirlamaMailGonderButonunaBas() {
        loginPages.sifirlamaMailGonderButonunaBas();
    }

    @Then("Sifirlama mail gonderildi mi")
    public void sifirlamaMailGonderildiMi() {
        loginPages.sifirlamaMailGonderildiMi();
    }

    @When("Kullanici butonuna basilir")
    public void kullaniciButonunaBasilir() {
        loginPages.kullaniciButonunaBasilir();
    }

    @When("Cikis butonuna basilir")
    public void cikisButonunaBasilir() {
        loginPages.cikisButonunaBasilir();
    }

    @When("Evet eminim butonuna basilir")
    public void evetEminimButonunaBasilir() {
        loginPages.evetEminimButonunaBasilir();
    }

    @Then("Cikis Yapildimi")
    public void cikisYapildimi() {
        loginPages.cikisYapildimi();
    }
}
