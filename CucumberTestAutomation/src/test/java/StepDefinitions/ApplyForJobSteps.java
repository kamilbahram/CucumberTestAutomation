package StepDefinitions;

import Pages.ApplyForJobStepsPages;
import Pages.LoginPages;
import Util.DriverFactory;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class ApplyForJobSteps {
    WebDriver driver = DriverFactory.getDriver();
    ApplyForJobStepsPages applyForJobStepsPages = new ApplyForJobStepsPages(driver);

    @When("Eposta Sifre Gir ve Dogrulama Kutucugunu Isaretle")
    public void epostaSifreGirVeDogrulamaKutucugunuIsaretle() {
        applyForJobStepsPages.epostaSifreGirVeDogrulamaKutucugunuIsaretle();
    }

    @When("Acik Pozisyonlar Menusuna Bas")
    public void acikPozisyonlarMenusunaBas() {
        applyForJobStepsPages.acikPozisyonlarMenusunaBas();
    }

    @When("Tum Acik Pozisyonlar Butonuna Bas")
    public void tumAcikPozisyonlarButonunaBas() {
        applyForJobStepsPages.tumAcikPozisyonlarButonunaBas();
    }

    @When("Giris Butonuna Bas")
    public void girisButonunaBas() {
        applyForJobStepsPages.girisButonunaBas();
    }
    @When("Basvuru Ara Alanina Bas ve Pozisyon Ismini Giriniz")
    public void basvuruAraAlaninaBasVePozisyonIsminiGiriniz() {
        applyForJobStepsPages.basvuruAraAlaninaBasVePozisyonIsminiGiriniz();
    }
    @When("Acik Pozisyonlar Butonuna Bas")
    public void acikPozisyonlarButonunaBas() {
        applyForJobStepsPages.acikPozisyonlarButonunaBas();
    }
    @When("Basvur Butonuna Bas")
    public void basvurButonunaBas() {
        applyForJobStepsPages.basvuruButonunaBas();
    }
    @Then("Basvuru Onay")
    public void basvuruOnay() {
        applyForJobStepsPages.basvuruOnay();
    }
}
