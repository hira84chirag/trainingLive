package api_testing;
import static io.restassured.RestAssured.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.filter.log.LogDetail;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class RequestSpecificationExample2 {

	RequestSpecification requestSpecification;
	
	@BeforeClass
	public void BeforeClass() 			{		
		RequestSpecBuilder Rsbuilder =new RequestSpecBuilder();
		Rsbuilder.setBaseUri("https://api.postman.com");
		Rsbuilder.addHeader("X-API-Key","PMAK-6766e110224b7600019821e6-7b6c6067013a23ffefd863d72ad57390b2");
		Rsbuilder.log(LogDetail.ALL);
		RestAssured.requestSpecification =Rsbuilder.build();
		
		requestSpecification= RestAssured.expect().
				statusCode(200).
				contentType(ContentType.JSON);
		
		requestSpecification=Rsbuilder.build();
	}
	
	@Test
    public void validate_response_code() {
		
		get("/workspaces").
			then().
			spec(requestSpecification).
			log().all();
	//		extract().response();
			
		//	assertThat(rs.path("workspaces[1].name").toString(),equalTo("Api-Testing"));	    	
	
	}
   
}
