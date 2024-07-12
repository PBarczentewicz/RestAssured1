import static io.restassured.RestAssured.when;

public class RestAssuredTest {
    public static void main(String[] args) {

        when().get("http://localhost:3000/posts").then().log().body();
    }
}

