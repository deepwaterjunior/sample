package org.smai.clients;

import io.restassured.RestAssured;
import org.junit.jupiter.api.BeforeAll;
import org.smai.RestAssuredClient;

import static org.smai.RestAssuredClient.prepareData;

public class BasicClient {

    @BeforeAll
    public static void setUp(){
      prepareData();
    }

}
