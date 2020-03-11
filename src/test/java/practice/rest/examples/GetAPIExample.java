package practice.rest.examples;

import helper.HelperBase;
import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.Assert;
import org.testng.annotations.Test;


public class GetAPIExample extends HelperBase {

    @Test()
    public void weatherExample(){
        String cityName="Chennai";
        //RestAssured.baseURI="http://restapi.demoqa.com/utilities/weathe";
        //RestAssured.baseURI="http://restapi.demoqa.com/utilities/weather/city";
        RestAssured.baseURI=prop.getProperty("baseURI")+"utilities/weather/city/";
        RequestSpecification httpRequest=RestAssured.given();
        Response response=httpRequest.request(Method.GET,cityName);
        String respBody=response.getBody().asString();
        System.out.println("Response is : "+respBody);
        System.out.println("Response Code is : "+response.getStatusCode());
        System.out.println("Response Code is : "+response.getStatusLine());
        //  String a=response.body().
       // Assert.assertEquals();
    }
}
