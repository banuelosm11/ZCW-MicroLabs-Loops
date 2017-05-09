package io.zipcoder.microlabs.mastering_loops;


import org.junit.Assert;
import org.junit.Test;

import java.util.Scanner;

public class CarRideTest {

    @Test
    public void areWeThereYetTest(){
        //Given:
        CarRide car = new CarRide ();
        String expected = "\"Are we there yet?\"\n + No\n\"Are we there yet?\"\nSpoons\n\"Are we there yet?\"\nYes\nGood!";

        //When:
        String actual = car.areWeThereYet();

        //Then:
        Assert.assertEquals("The strings are equal", expected, actual);
    }


}
