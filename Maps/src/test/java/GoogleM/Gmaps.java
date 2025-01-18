
package GoogleM;

import static io.restassured.RestAssured.*;

import org.testng.Assert;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

public class Gmaps {
	public static void main(String[] args) {

		RestAssured.baseURI = "https://rahulshettyacademy.com";

		// posting the data
		String content = given().log().all().queryParam("key", "qaclick123")
				.body("{ \r\n" + "\r\n" + "  \"location\": { \r\n" + "\r\n" + "    \"lat\": -38.383494, \r\n" + "\r\n"
						+ "    \"lng\": 33.427362 \r\n" + "\r\n" + "  }, \r\n" + "\r\n" + "  \"accuracy\": 50, \r\n"
						+ "\r\n" + "  \"name\": \"Frontline house\", \r\n" + "\r\n"
						+ "  \"phone_number\": \"(+91) 983 893 3937\", \r\n" + "\r\n"
						+ "  \"address\": \"29, side layout, cohen 09\", \r\n" + "\r\n" + "  \"types\": [ \r\n" + "\r\n"
						+ "    \"shoe park\", \r\n" + "\r\n" + "    \"shop\" \r\n" + "\r\n" + "  ], \r\n" + "\r\n"
						+ "  \"website\": \"http://google.com\", \r\n" + "\r\n" + "  \"language\": \"French-IN\" \r\n"
						+ "\r\n" + "} ")
				.when().post("maps/api/place/add/json").then().log().all().statusCode(200).extract().response()
				.asString();

		// Extracting the place id
		JsonPath js1 = new JsonPath(content);
		String placeid = js1.get("place_id");

		// extracting the address after post after retriving
		String afterpost = given().log().all().queryParam("key", "qaclick123").queryParam("place_id", placeid).when()
				.get("maps/api/place/get/json").then().log().all().statusCode(200).extract().response().asString();

		JsonPath js2 = new JsonPath(afterpost);
		String addressoriginal = js2.getString("address");

		// update the address
		String updatedContent = given().log().all().queryParam("key", "qaclick123")
				.body("{\r\n" + "\"place_id\":\"" + placeid + "\",\r\n" + "\"address\":\"70 Summer walk, USA\",\r\n"
						+ "\"key\":\"qaclick123\"\r\n" + "}\r\n" + "")
				.when().put("maps/api/place/update/json").then().log().all().statusCode(200).extract().response()
				.asString();

		// extracting the updated address after put function
		String afterput = given().log().all().queryParam("key", "qaclick123").queryParam("place_id", placeid).when()
				.get("maps/api/place/get/json").then().log().all().statusCode(200).extract().response().asString();

		JsonPath js3 = new JsonPath(afterput);
		String addressupdated = js3.getString("address");

		System.out.println(addressoriginal);
		System.out.println(addressupdated);

		// Asserting the original and updated value are same or not
		Assert.assertNotEquals(addressupdated, addressoriginal);

		// To retrieve the data
		
		  given().log().all().queryParam("key", "qaclick123").queryParam("place_id",
		  placeid).when()
		  .get("maps/api/place/get/json").then().log().all().statusCode(200).extract().
		  response().asString();
		 

		// deleting the data
		given().log().all().queryParam("key", "qaclick123")
				.body("{ \r\n" + "\r\n" + "    \"place_id\":\"" + placeid + "\"\r\n" + "\r\n" + "} ").when()
				.delete("maps/api/place/delete/json").then().log().all().statusCode(200).extract().response()
				.asString();

		// Getting the data after deleting it
		given().log().all().queryParam("key", "qaclick123").queryParam("place_id", placeid).when()
				.get("maps/api/place/get/json").then().log().all().statusCode(404).extract().response().asString();

	}
}
