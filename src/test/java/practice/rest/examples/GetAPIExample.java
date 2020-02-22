package practice.rest.examples;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class GetAPIExample {

    @Test
    public void weatherExample(){
        RestAssured.baseURI="http://restapi.demoqa.com/utilities/weather/city";
        RequestSpecification httpRequest=RestAssured.given();
        Response response=httpRequest.request(Method.GET,"/Chennai");
        String respBody=response.getBody().asString();
        System.out.println("Response is : "+respBody);
        System.out.println("Response Code is : "+response.getStatusCode());
        System.out.println("Response Code is : "+response.getStatusLine());
    }
}
