package credop;

import static io.restassured.RestAssured.*;

import org.testng.Assert;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.ValidatableResponse;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

//import java.util.HashMap;
//import java.util.Map;
//import org.json.simple.JSONObject;
//import org.testng.Assert;
//import org.testng.annotations.Test;

//import static io.restassured.RestAssured.*;
//import io.restassured.http.ContentType;
//import io.restassured.internal.path.json.mapping.JsonObjectDeserializer;
//import io.restassured.response.Response;
import static org.hamcrest.Matchers.*;
import static org.hamcrest.Matchers.equalTo;

import org.assertj.core.api.Assertions;
import static org.assertj.core.api.Assertions.*;

import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class putpatchdelete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RestAssured.baseURI = "https://jsonplaceholder.typicode.com";
//		 Response response = given().contentType(ContentType.JSON).when().get("/posts").then().extract().response();
		String requestBody = given().contentType(ContentType.JSON).param("postId", "2").when().get("/posts").then()
				.log().all().statusCode(200).extract().response().asString();
//		JsonPath js = new JsonPath(requestBody);
//		String title = js.getString("title");
//		String body = js.getString("body");
//		String userId = js.getString("userId");
//		String id = js.getString("id");
//		

//		post request
		String requestBody1 = given().header("Content-type", "application/json")
				.body("{\n" + "  \"title\": \"foo\",\n" + "  \"body\": \"bar\",\n" + "  \"userId\": \"1\" \n}").when()
				.post("/posts").then().log().all().statusCode(201).extract().response().asString();

		Assert.assertNotEquals(201, requestBody1);

		// Assertions.assertEquals("foo", requestBody1.jsonPath().asString("title"));

//		put request

		String requestBody2 = given().header("Content-type", "application/json")
				.body("{\n" + "  \"title\": \"foo\",\n" + "  \"body\": \"baz\",\n" + "  \"userId\": \"1\",\n"
						+ "  \"id\": \"1\" \n}")
				.when().put("/posts/1").then().log().all().statusCode(200).extract().response().asString();

//		PATCH Request

		String requestBody3 = given().header("Content-type", "application/json")
				.body("{\n" + "  \"title\": \"bax\" \n}").when().patch("/posts/1").then().log().all().statusCode(200)
				.extract().response().asString();

//		DELETE Request

		String requestBody4 = given().header("Content-type", "application/json").when().delete("/posts/1").then()
				.statusCode(200).extract().response().asString();

		JsonPath js = new JsonPath(requestBody);
//		JsonPath js1 = new JsonPath(requestBody1);	
//		JsonPath js2 = new JsonPath(requestBody2);	
//		JsonPath js3 = new JsonPath(requestBody3);	
//		String title = js.getString("title");
//		String body = js.getString("body");
//		String userId = js.getString("userId");
//		String id = js.getString("id");

//		System.out.println(title);
//		System.out.println(body);
//		System.out.println(userId);
//		System.out.println(id);

//		Assert.assertNotEquals("foo", js.getString("title"));
//		Assert.assertNotEquals("bar", requestBody11.jsonPath().getString("body"));
//		Assert.assertNotEquals("1", requestBody11.jsonPath().getString("userId"));
//		Assert.assertNotEquals("101", requestBody11.jsonPath().getString("id"));

//				given().log().all()
//				.body("{\n" +
//			            "  \"title\": \"foo\",\n" +
//			            "  \"body\": \"bar\",\n" +
//			            "  \"userId\": \"1\" \n}")
//				.header("Content-type", "application/json")
//                .and()
//                .body()
//                .when()
//                .post("/posts")
//                .then()
//                .extract().response();
//				.asString();

//		to add parameter
//		String response1 = given().contentType(ContentType.JSON).param("postId", "2").when().get("/comments").then()
//				.extract().response().jsonPath().getString("email[3]").toString();

//		JsonPath js1 = new JsonPath(response);
//		String title = js1.get("title");
		// System.out.println("title");
		// Assertions.assertEquals(200, response.statusCode());
		// Assertions.assertEquals("qui est esse",
		// response.jsonPath().getString("title[1]"));

	}

}
