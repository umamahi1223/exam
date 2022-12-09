package Testcases;

import static io.restassured.RestAssured.given;


import org.json.JSONArray;
import org.json.JSONObject;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Utility.ExtentReportManager;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

public class Api_Get {
	 ResponseSpecification res;
     RequestSpecification req_spec;
     String str=" ";
     @BeforeClass
       public void setSpecification() {
   	res = RestAssured.expect();
   	res.statusLine("HTTP/1.1 200 OK");
   	res.contentType(ContentType.JSON);
   	ExtentReportManager.createReport("API_test");
       }  
     @Test(priority=1)
     public void getBanner() {
     	 ExtentReportManager.startTest("TestCase_getBanner");
         RestAssured.baseURI="http://arcadia.pisystindia.com/";
         
         Response resp=given().header("Authorization",str).when().get("api/getBanner").then().contentType(ContentType.JSON).extract().response();
       
         System.out.println("Get output is = "+resp.asPrettyString());                     
         JSONObject obj = new JSONObject(resp.body().asPrettyString());
         JSONArray arr = obj.getJSONArray("payload");
         
         
         System.out.println("GetBanner output:"+resp.body().asPrettyString());
     }
             
     
@Test(priority=2)
public void profileDetails() {
	 ExtentReportManager.startTest("TestCase_profileDetails");
    RestAssured.baseURI="http://arcadia.pisystindia.com/";
   
    Response resp=given().header("Authorization",str).when().get("api/user/profileDetails").then().contentType(ContentType.JSON).extract().response();
    
    System.out.println("Get output is = "+resp.asPrettyString());                     
    JSONObject obj = new JSONObject(resp.body().asPrettyString());
    
   
    
    System.out.println("profileDetails output:"+resp.body().asPrettyString());
}
        

}
	