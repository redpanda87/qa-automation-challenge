package challenge.APITests;

import challenge.config.TestConfig;
import static io.restassured.RestAssured.given;

import org.junit.Assert;
import org.junit.Test;

public class Booking extends TestConfig {


    String json="{\"bookingdates\":{\"checkin\":\"2019-11-27T09:43:20.092Z\",\"checkout\":\"2019-11-30T09:43:20.092Z\"},\"bookingid\":60000,\"depositpaid\":true,\"email\":\"d.vildel@gmail.com\",\"firstname\":\"Diego\",\"lastname\":\"Vilallta\",\"phone\":\"60590079\",\"roomid\":4}";
    String jsonUpdate = "{\"bookingid\":12,\"roomid\":3438,\"firstname\":\"Juana\",\"lastname\":\"Banana\",\"depositpaid\":true,\"bookingdates\":{\"checkin\":\"2019-12-18\",\"checkout\":\"2019-12-20\"}}";

    @Test
    public void validate_get_all_bookings(){
         given().log().all().when().get("/").then().log().all().statusCode(200);


    }

    @Test
    public void validate_get_booking_by_id(){
       String value =  given().log().all()
                .when().get("/1")
                .jsonPath().getString("firstname");
        Assert.assertEquals(value,"James");


    }

    @Test
    public void create_new_booking(){
        given().body(json)
                .when().log().all().post("/")
                .then().assertThat().statusCode(409);

    }

    @Test
    public void update_booking(){
        given().body(jsonUpdate)
                .when().log().all().put("/")
                .then().assertThat().statusCode(400);

    }

    @Test
    public void delete_booking(){
        given()
                .when().log().all().delete("/3")
                .then().assertThat().statusCode(200);

    }


}
