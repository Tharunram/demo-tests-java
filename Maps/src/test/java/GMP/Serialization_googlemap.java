package GMP;

import java.util.ArrayList;
import java.util.List;
import static io.restassured.RestAssured.*;
import org.testng.annotations.Test;
 
import io.restassured.RestAssured;
 
public class Serialization_googlemap{
 
	public static void main(String args[]) {

		POJO_addPlace addPlace = new POJO_addPlace();
		Location loc=new Location();
		loc.setLng(-38.383494);
		loc.setLat(33.427362);
		addPlace.setLocation(loc);
		addPlace.setAccuracy(50);
		addPlace.setName("Frontline house");
		addPlace.setPhone_num("(+91) 983 893 3937");
		addPlace.setAdd("29, side layout, cohen 09");
		addPlace.setLang("French-IN");
		addPlace.setWebsite("http://google.com");
		List<String> type= new ArrayList<String>();
		type.add("shoe park");
		type.add("shop");
		addPlace.setTypes(type);
		RestAssured.baseURI="https://rahulshettyacademy.com";
		ResponsePOJO_addPlace resppojoaddplace =given().log().all().queryParam("key","qaclick123").body(addPlace)
				.when().log().all().post("/maps/api/place/add/json").then().log().all().assertThat().statusCode(200)
				.extract().response().as(ResponsePOJO_addPlace.class);
		System.out.println("Status"+resppojoaddplace.getStatus());
		System.out.println("Place_id "+resppojoaddplace.getPlace_id());
		System.out.println("Scope "+resppojoaddplace.getScope());
		System.out.println("reference "+resppojoaddplace.getReference());
		System.out.println("Id "+resppojoaddplace.getId());
	

	}
}