package Milestone_4;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;



public class EndToEndTesting {

	 @BeforeClass
	 
	  public void setUp() {
		  
		 baseURI ="https://reqres.in/";
		 
		  
	 }
	 
  @Test(priority=1)
  public void getallPosts() {
	  
  System.out.println("Get ALl Posts");
	  
	  
	  given()
	  .when()
	      .get("/api/users?page=2")
	  .then()
	      .statusCode(200);
	  
	  
  }
  @Test(priority=2)
  public void getonePost() {
  
	  System.out.println("Get one Post");
	  
	  
	  given()
	  .when()
	      .get("/api/users/2")
	  .then()
	      .statusCode(200);
	  
	  
  }

  
  @Test(priority=3)
  public void createPost() {
  
	  System.out.println("create Post");
	  
String reqBody ="{\n"
		+ "	  		+ \"    \"name\": \"morpheus\",n\"\n"
		+ "	  		+ \"    \"job\": \"leader\",\n\"\n"
		
		+ "	  		+ \"}";
	  
	  
	  given()
	  .body(reqBody)
	  .when()
	      .post("/api/users")
	  .then()
	      .statusCode(201);
	  
	  
  }

  @Test(priority=4)
  public void updatePost() {
  
	  System.out.println("update  one Post");
	  
String reqBody ="{\n"
		+ "	  		+ \"    \"name\": \"morpheus\",n\"\n"
		+ "	  		+ \"    \"job\": \"zion resident\",\n\"\n"
		
		+ "	  		+ \"}";
	  
	  given()
	  .body(reqBody)
	  .when()
	      .put("/api/users/2")
	  .then()
	      .statusCode(200);
	  
	  
  }
  
  
  @Test(priority=5)
  public void patchPost() {
  
	  System.out.println("update  one Post");
	  
String reqBody ="{\n"
		
		+ "	  		+ \"    \"job\": \"resident\",\n\"\n"
		
		+ "	  		+ \"}";
	  
	  
	  given()
	  .body(reqBody)
	  .when()
	      .patch("/api/users/2")
	  .then()
	      .statusCode(200);
	  
	  
  }
  
  
  @Test(priority=6)
  public void deletePost() {
  
	  System.out.println("Delete one Post");
	  

	  
	  given()
	  
	  .when()
	      .delete("/api/users/2")
	  .then()
	      .statusCode(204);
	  
	  
  }

  }

