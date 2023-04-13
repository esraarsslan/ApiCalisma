@us13_tc01
  Feature: US-13 Vice Dean ogretmen olusturabilmelidir
    Scenario: TC01 Vice Dean olarak ogretmen olusturma
    Given Site adresine gidilir
    When Vice Dean rolu ile login islemi gerceklestirilir
    When Menu butonuna tiklar
    When Teacher Management'a tiklar
    And Ogretmenin girecegi ders secilir
    And Name girilir
    And Surname girilir
    And Birth Place girilir
    And Email girilir
    And Phone number girilir
    And Gender female secilir
    And Date Of Birth girilir
    And Ssn girilir
    And User Name girer
    And Password girer
    And Submit tiklanir
    Then Islemin gerceklestigine dair popUp mesajini goruntuler
    Then Sayfa kapatilir