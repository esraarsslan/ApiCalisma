Feature: Admin, Deanleri görebilmeli ve silebilmeli

  Background:
    Given Kullanici verilen baglantiya gider
    Then Login butonuna tiklar
    And Admin bilgilerini girer
    And Login butonuna tiklar
    And Menu butonuna tiklar
    And Acilan bolumden Dean Management'a tiklar

    @us05_tc01
    Scenario:Admin Dean'lerin Name bilgisini görebilmeli
      Then Dean'lerin Name bilgilerinin gorunur oldugunu dogrular

    @us05_tc02
    Scenario:Admin Dean'lerin Gender bilgisini görebilmeli
      Then Dean'lerin Gender bilgilerinin gorunur oldugunu dogrular

    @us05_tc03
    Scenario:Admin Dean'lerin Phone Number bilgisini görebilmeli
      Then Dean'lerin Phone Number bilgilerinin gorunur oldugunu dogrular

    @us05_tc04
    Scenario:Admin Dean'lerin SSN bilgisini görebilmeli
      Then Dean'lerin SSN bilgilerinin gorunur oldugunu dogrular

    @us05_tc05
      Scenario:Admin Dean'lerin User Name bilgisini görebilmeli
      Then Dean'lerin User Name bilgilerinin gorunur oldugunu dogrular

    @us05_tc06
    Scenario:Admin Deanleri silebilmeli
      And Silme butonuna tiklar
      Then Dean'in silindigini dogrular

    @us05_tc07
    Scenario: Admin Dean'leri günceleyebilmeli
      And Guncellemek istenen Dean'nin Edit butonuna tiklar
      And Name alanina veri girer
      And Submit butonuna tiklar
      And Edit penceresini kapatir
      Then Dean'in Name bilgisinin guncellendigini dogrular









