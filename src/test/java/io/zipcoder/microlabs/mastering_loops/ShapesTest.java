package io.zipcoder.microlabs.mastering_loops;


import org.junit.Test;
import org.junit.Assert;

public class ShapesTest {



    @Test
    public void triangleTest(){
        //: Given
        Shapes shape = new Shapes();
        String expected = "*** Output ***\ntriangle()\n*\n**\n***\n****\n*****";

        //: When
        String actual = shape.triangle();

        //: Then
        Assert.assertEquals("The strings are equal", expected, actual);
    }

    @Test
    public void tableSquareTest(){
        //: Given

        //: When

        //: Then
    }
}
