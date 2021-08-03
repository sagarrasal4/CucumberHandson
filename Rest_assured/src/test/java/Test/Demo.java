package Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import static org.hamcrest.CoreMatchers.equalTo;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class Demo {

	
	// base url is static
	public static String baseurl ="https://api.trello.com";
	
	@Test
				public void test1() {
		
		//in rest assured
		RestAssured.baseURI=baseurl;
		//given , when, then 
		//given is a precondition to take you to parameters  -- header, authorization
		
		given().
		param("key","72d5d9dd268b7dd37f9fc7ab42f341b7").
		param("token","a30f524a798c3c1b8a7980a132f6d815304c96b67b23e74370e021f6ef2beff0").
		//when is used to give methood get,put,delete also body
		when().
		get("/1/boards/SGW0IuYg").
        then().  //post condition
        assertThat().statusCode(200).contentType(ContentType.JSON).and().
        body("name",  equalTo("SDET")).and().
        body("desc",equalTo("SDET Demo"));;	
		System.out.println("Executed successfully");
		}
		
	@Test
		public void Test2()
		
		{
			
			//in rest assured
			RestAssured.baseURI=baseurl;
			//given , when, then 
			//given is a precondition to take you to parameters  -- header, authorization
			
			given().
			param("key","72d5d9dd268b7dd37f9fc7ab42f341b7").
			param("token","a30f524a798c3c1b8a7980a132f6d815304c96b67b23e74370e021f6ef2beff0").
			//when is used to give methood get,put,delete also body
			when().
			get("/1/boards/SGW0IuYg").
	        then().  //post condition
	        assertThat().statusCode(200).contentType(ContentType.JSON).and().
	        header("Expires",equalTo("Thu, 01 Jan 1970 00:00:00")).and().
	        header("Content-Encoding",equalTo("gzip"));
			System.out.println("Executed successfully");
			
		}
		
	@Test
		public void Test3()
		
		{
			
			//in rest assured
			RestAssured.baseURI=baseurl;
			String boardname="SDET"+ (int) (Math.random()*100);
			//given , when, then 
			//given is a precondition to take you to parameters  -- header, authorization
			
			given().
			queryParam("key","72d5d9dd268b7dd37f9fc7ab42f341b7").
			queryParam("token","a30f524a798c3c1b8a7980a132f6d815304c96b67b23e74370e021f6ef2beff0").
			queryParam("name",boardname).
			queryParam("desc","using eclipse").
			header("content-type","application/jason").
			//when is used to give methood get,put,delete also body
			when().
			post("/1/boards").
	        then().  //post condition
	        assertThat().statusCode(200).contentType(ContentType.JSON).and().
	        header("Expires",equalTo("Thu, 01 Jan 1970 00:00:00")).and().
	        header("Content-Encoding",equalTo("gzip"));
			System.out.println("Executed successfully");
			
		}
		
	}
	

