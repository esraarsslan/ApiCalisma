package utilities;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class StudentInfoToken {

    public static String studentInfoToken(){

        Map<String, Object> bodyMap = new HashMap<>();
        bodyMap.put("password","ye7aflbz1a");
        bodyMap.put("username","johnna.denesik");

        Response response = given().contentType(ContentType.JSON).body(bodyMap).post("https://209.38.244.227/auth/login");
        return  response.jsonPath().getString("token");
    }
}


