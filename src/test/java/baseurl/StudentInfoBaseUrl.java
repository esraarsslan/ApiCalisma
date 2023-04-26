package baseurl;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import utilities.StudentInfoToken;

import static utilities.Authentication.generateToken;
import static utilities.StudentInfoToken.studentInfoToken;

public class StudentInfoBaseUrl {

    public static RequestSpecification spec2;

    public static void setUpBeforeAPI() {
        spec2= new RequestSpecBuilder().
                setContentType(ContentType.JSON).
                addHeader("Authorization", "Bearer " + studentInfoToken()).
                setBaseUri("https://209.38.244.227/").
                build();
    }

}

