package challenge.config;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;
import org.junit.BeforeClass;


public class TestConfig {
    @BeforeClass
    public static void setup(){
        RestAssured.baseURI = "https://automationintesting.online";
        RestAssured.basePath ="/booking";
        RequestSpecification requestSpecification = new RequestSpecBuilder().
                addHeader("Content-Type","application/json").
                addHeader("Accept","Application/json").
                build();

        RestAssured.requestSpecification =requestSpecification;

    }
}
