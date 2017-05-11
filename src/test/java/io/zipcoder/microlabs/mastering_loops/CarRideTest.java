package io.zipcoder.microlabs.mastering_loops;


import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.util.Scanner;

public class CarRideTest {

    @Test
    public void areWeThereYetTest(){
        //Given:
        String input = "No\nSpoons\nyes";
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(input.getBytes());
        CarRide car = new CarRide (byteArrayInputStream);
        String expected = "Good!";

        //When:
        String actual = car.areWeThereYet();

        //Then:
        Assert.assertEquals("The strings are equal", expected, actual);
    }


}
