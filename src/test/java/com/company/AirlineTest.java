package com.company;

import org.junit.Ignore;
import org.junit.jupiter.api.BeforeAll;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AirlineTest extends Airline {


    private static AirlineTest airlineTest;



    public AirlineTest() {
        super();

    }

    @BeforeAll
   static void init(){
        airlineTest= new AirlineTest();
    }
@Ignore
    @Test
    public void testGetTime() {
    }
    @Ignore
    @Test
    public void testOtv() {
    }

    @Test
    public void testDivide() {
        airlineTest= new AirlineTest();
        assertEquals(6, airlineTest.divide(18,3));
    }
    @Ignore
    @Test
    public void testReys_of_city() {
    }
    @Ignore
    @Test
    public void testFlight_list() {
    }
    @Ignore
    @Test
    public void testFlight_list_with_time() {
    }
}