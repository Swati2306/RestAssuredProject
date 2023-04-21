package org.example;

import io.restassured.RestAssured;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.testng.AssertJUnit.assertTrue;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        RestAssured.baseURI = "https://restful-booker.herokuapp.com";

        given().
          when().get("/ping").
            then().statusCode(201);
        //assertTrue( true );
    }
}
