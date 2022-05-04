package com.rodrigow.demo.contract;

import com.rodrigow.demo.sccwithpact.GreetingController;
import io.restassured.module.mockmvc.RestAssuredMockMvc;
import org.junit.jupiter.api.BeforeEach;

public abstract class BaseTestClass {

    @BeforeEach
    public void setup() {
        RestAssuredMockMvc.standaloneSetup(new GreetingController());
    }
}
