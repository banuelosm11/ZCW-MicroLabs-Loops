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
        Shapes shape = new Shapes();
        String expected = "*** Output ***\ntableSquare()\nA 4 x 4 table square\n" +"| 1 | 2 |  3 |  4 |\n" + "| 2 | 4 |  6 |  8 |\n"
                + "| 3 | 6 |  9 | 12 |\n" + "| 4 | 8 | 12 | 16 |";

        //: When
        String actual = shape.tableSquare();

        //: Then
        Assert.assertEquals("The strings are equal", expected, actual);
    }

    @Test
    public void tableSquaresTest(){
        //: Given
        Shapes shape = new Shapes();
        int n = 6;
        String expected = "*** Output ***\ntableSquares()\nA " + n +" x "+ n + " table square\n" +
                "| 1 |  2 |  3 |  4 |  5 |  6 |\n"+
                "| 2 |  4 |  6 |  8 | 10 | 12 |\n"+
                "| 3 |  6 |  9 | 12 | 15 | 18 |\n"+
                "| 4 |  8 | 12 | 16 | 20 | 24 |\n"+
                "| 5 | 10 | 15 | 20 | 25 | 30 |\n"+
                "| 6 | 12 | 18 | 24 | 30 | 36 |";

        //: When
        String actual = shape.tableSquares(n);

        //: Then
        Assert.assertEquals("The strings are equal", expected, actual);
    }

    @Test
    public void digitsInNumberTest(){
        //Given
        int nums = 123;
        Shapes shape = new Shapes();
        int expected = 3;

        //When
        int actual = shape.digitsInNumber(nums);

        //Then
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void addSpaceTest(){
        //Given
        Shapes shape = new Shapes();
        String expected = " ";
        int currentNum = 1;
        int lastNumInCol = 9;

        //When
        String actual = shape.addSpace(currentNum, lastNumInCol);

        //Then
        Assert.assertEquals(expected, actual);
    }

}
