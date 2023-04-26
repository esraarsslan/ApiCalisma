@Api_US17
  Feature: Post_StudentInfo

    Scenario: TC_01_Teacher, öğrencilere not verebilmelidir.
      Given Teacher ogrencilere not verebilmek icin post request gonderir.
      Then teacher ogrenci not bilgilerini alir ve datayi dogrular.
