package stepdefinitions.api;

import baseurl.StudentInfoBaseUrl;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.response.Response;
import org.openqa.selenium.json.Json;
import pojos.us17pojo;
import static io.restassured.RestAssured.given;

public class us17  {

    /*
    object": {
        "id": 2,
        "midtermExam": 55.0,
        "finalExam": 65.0,
        "absentee": 5,
        "infoNote": "iyi gidiyorsun",
        "lessonName": "yeniapideneme",
        "creditScore": 3,
        "educationTerm": "SPRING_SEMESTER",
        "average": 61.0,
        "studentResponse": {
            "userId": 1,
            "username": "idil03",
            "name": "idil",
            "surname": "Bksgn",
            "birthDay": "2007-01-01",
            "birthPlace": "istanbul",
            "phoneNumber": "532-123-5500",
            "gender": "FEMALE",
            "studentNumber": 1000,
            "motherName": "Nihal",
            "fatherName": "hakan",
            "email": "idil@hotmail.com",
            "active": true
        },
        "compulsory": true,
        "note": "CC"
    },
    "message": "Student Info updated Successfully",
    "httpStatus": "CREATED"
}
     */

    /*expected data
    {
  "absentee": 1,
  "educationTermId": 1,
  "finalExam": 45,
  "infoNote": "derslerine cok calismali",
  "lessonId": 4,
  "midtermExam": 67,
  "studentId": 1
}
     */
//http://209.38.244.227/students/save
    @Given("Teacher ogrencilere not verebilmek icin post request gonderir.")
    public void teacher_ogrencilere_not_verebilmek_icin_post_request_gonderir() {

        //  spec2.pathParams("ppt1","students","ppt2","save");

String url = "http://209.38.244.227/students/save";
        //Set the expected data
        us17pojo us17pojo = new us17pojo(1,1,45,"derslerine cok calismali",4,67,1);
        System.out.println("expectedData = " + us17pojo);

//      Response response = given(spec2).body(us17pojo.toString()).
//              when().post("{ppt1}/{ppt2}");
        Response response = given().auth().basic("ye7aflbz1a","johnna.denesik").body(us17pojo).when().post(url);;
        response.prettyPrint();

    }

    @Then("teacher ogrenci not bilgilerini alir ve datayi dogrular.")
    public void teacher_ogrenci_not_bilgilerini_alir_ve_datayi_dogrular() {
    }
}