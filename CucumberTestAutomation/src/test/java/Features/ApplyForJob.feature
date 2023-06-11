Feature: Baykar Kariyer Is Basvuru

  Scenario: Kariyer Is Basvurusu Yap (Daha önce kayıt olmus ve profil bilgilerinin doldurmus kullanici)
    When Acik Pozisyonlar Menusuna Bas
    When Tum Acik Pozisyonlar Butonuna Bas
    When Basvuru Ara Alanina Bas ve Pozisyon Ismini Giriniz
    When Basvur Butonuna Bas
    When Eposta Sifre Gir ve Dogrulama Kutucugunu Isaretle
    When Giris Butonuna Bas
    When Acik Pozisyonlar Butonuna Bas
    When Basvuru Ara Alanina Bas ve Pozisyon Ismini Giriniz
    When Basvur Butonuna Bas
    Then Basvuru Onay


    


