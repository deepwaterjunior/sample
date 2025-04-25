package org.smai;

import io.restassured.RestAssured;

import static io.restassured.path.xml.XmlPath.given;

public class RestAssuredClient {


    public static void prepareData(){
        Config config = new Config();
        RestAssured.baseURI = config.getPetStoreHost();
    }
}
