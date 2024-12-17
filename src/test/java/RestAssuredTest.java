import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

class RestAssuredExample
{
    public static void main(String[] args)
    {
        RestAssured.baseURI = "http://bug-api.dev.hill";
        Response response = RestAssured.given()
                .contentType(ContentType.JSON)
                .body("{\"email\": \"root@local.dev\",\"password\": \"root\"}")
                .post("/token");

        System.out.println("Status:  " + response.getStatusCode());
        System.out.println("Body:    " + response.body().asString());
        System.out.println("Headers: " + response.getHeaders());
    }
}