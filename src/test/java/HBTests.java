
import io.restassured.internal.common.assertion.Assertion;
import io.restassured.response.Response;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.function.BooleanSupplier;

import static io.restassured.RestAssured.given;


public class HBTests {
    @Test
    public void APITest()
    {
        Response response = given()
                .when()
                .get("https://httpbin.org/json");

        response.then().statusCode(200);
        System.out.println("Status code :200");
        ArrayList items = response.jsonPath().getJsonObject("slideshow.slides.items");
        Assertions.assertFalse(items.isEmpty());
        System.out.println("items value not null:"+ items);
    }
}
