package base_urls;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;

import static utilities.AuthenticationSchoolManagement.generateToken;


public class SchoolManagementonBaseUrl {


    public static RequestSpecification spec;

    public static void schoolSetUp(){

        spec = new RequestSpecBuilder().
                setContentType(ContentType.JSON).
                addHeader("Authorization","Bearer "+generateToken()).
                setBaseUri("https://school-management-v1.herokuapp.com").build();

    }
}
