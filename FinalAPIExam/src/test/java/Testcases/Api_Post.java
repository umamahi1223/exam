package Testcases;

import static io.restassured.RestAssured.given;

import java.util.HashMap;
import java.util.LinkedHashMap;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

public class Api_Post {
	ResponseSpecification res;
    RequestSpecification req_spec;
    String str=" ";
    @BeforeClass
      public void setSpecification() {
  	res = RestAssured.expect();
  	res.statusLine("HTTP/1.1 200 OK");
  	res.contentType(ContentType.JSON);
      }              
    @Test(priority=1)
      public void loginuser() {
          
          HashMap<String,String> params = new HashMap<String, String>();
          params.put("username", "kumarkharare@gmail.com");
          params.put("password", "123456");
          RestAssured.baseURI="https://arcadia.pisystindia.com/";
          
          
          
          Response resp = given().when().contentType("application/json").body(params).post("api/login").then().contentType(ContentType.JSON).extract().response();
          System.out.println("op is"+resp.asPrettyString());
          LinkedHashMap<String,Object> payload= resp.body().jsonPath().get("payload");
          
          System.out.println(payload.toString());             
      }
    @Test(priority=2)
    public void ForgotPassword() {
        
        HashMap<String,String> params = new HashMap<String, String>();
        params.put("username", "kumarkharare@gmail.com");
        params.put("password", "123456");
        RestAssured.baseURI="https://arcadia.pisystindia.com/";
        
        
        
        Response resp = given().when().contentType("application/json").body(params).post("api/password/reset").then().contentType(ContentType.JSON).extract().response();
        System.out.println("op is"+resp.asPrettyString());
        LinkedHashMap<String,Object> payload= resp.body().jsonPath().get("payload");
                    
    } 
}
