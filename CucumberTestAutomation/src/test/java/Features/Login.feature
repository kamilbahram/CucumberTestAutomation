Feature: Baykar Kariyer
||Login akışlarından senaryolar içermektedir||
  Scenario: Baykar Kariyer Login
    When Giris butonuna bas
    When Eposta Sifre gir ve dogrulama kutucugunu isaretle
    When Uye Giris butonuna bas
    Then Giris yapildi mi

  Scenario: Baykar Kariyer Login And Logout
    When Giris butonuna bas
    When Eposta Sifre gir ve dogrulama kutucugunu isaretle
    When Uye Giris butonuna bas
    When Kullanici butonuna basilir
    When Cikis butonuna basilir
    When Evet eminim butonuna basilir
    Then Cikis Yapildimi

  Scenario: Baykar Kariyer Hesap Olustur
    When Giris butonuna bas
    When Hesap Oluştur butonuna bas
    When Eposta Sifre Sifre(Tekrar) gir ve dogrulama kutucugunu isaretle
    When Kaydol butonuna bas
    Then Dogrulama mail gonderildi mi

  Scenario: Sifremi Unuttum (Sifirlama Mail Gönder)
    When Giris butonuna bas
    When Sifremi unuttum butonuna bas
    When Eposta gir ve dogrulama kutucugunu isaretle
    When Sifirlama mail gonder butonuna bas
    Then Sifirlama mail gonderildi mi






