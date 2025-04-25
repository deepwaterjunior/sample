package org.smai.clients;

import io.restassured.RestAssured;
import io.restassured.config.RestAssuredConfig;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import org.smai.enums.Endpoints;

import static io.restassured.RestAssured.given;

public class PetStoreClient extends BasicClient {


    public static ValidatableResponse getStoreInventory(){
        BasicClient.setUp();
        return  given()
             .contentType(ContentType.JSON)
             .when()
             .log().all()
             .get(Endpoints.GET_STORE_INVENTORY.getEndpoint())
             .then().log().all();

    }

}
