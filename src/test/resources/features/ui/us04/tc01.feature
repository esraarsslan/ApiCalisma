Feature: Admin Dean ekleyebilmeli

  @us04_tc01
  Scenario: "Name" girilmelidir. Boş bırakılamaz.
    Given Kullanici verilen baglantiya gider
    Then Login butonuna tiklar
    And Admin bilgilerini girer
    And Login butonuna tiklar
    And Menu butonuna tiklar
    And Acilan bolumden Dean Management'a tiklar
    And Name alanina tiklar
    Then "Required" uyarisinin goruntulendigini dogrular

    @us04_tc02
    Scenario: "Name" alanina sadece space karakteri girildiginde Submit butonu aktif olmamali
      Given Kullanici verilen baglantiya gider
      When Admin olarak Login yapar
      And Menu butonuna tiklar
      And Acilan bolumden Dean Management'a tiklar
      And Name alanina space karakteri girer
      And Surname alanina veri girer
      And Birth Place alanina veri girer
      And Cinsiyet secer
      And Birthday alanina veri girer
      And Phone alanina veri girer
      And Ssn alanina veri girer
      And User Name alanina veri girer
      And Password alanina veri girer
      And Submit butonuna tiklar
      Then Hata mesaji goruntulendigini dogrular





















