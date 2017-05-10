package io.zipcoder.microlabs.mastering_loops;

import org.junit.Assert;
import org.junit.Test;
import sun.jvm.hotspot.jdi.InterfaceTypeImpl;

public class NumbersTest {

    @Test
    public void oneToTenTest(){
        //: Given
        Numbers numbers = new Numbers();
        String expected = "*** Output ***\noneToTen()\n1\n2\n3\n4\n5\n6\n7\n8\n9\n10";

        //: When
        String actual = numbers.oneToTen();

        //: Then
        Assert.assertEquals("The two strings are equal", expected, actual);
    }

    @Test
    public void oddNumbersTest(){
        //: Given
        Numbers numbers = new Numbers ();
        String expected = "*** Output ***\noddNumbers()\n1\n3\n5\n7\n9\n11\n13\n15\n17\n19";

        //: When
        String actual = numbers.oddNumbers();

        //: Then
        Assert.assertEquals("The two strings are equal", expected, actual);
    }

    @Test
    public void squaresTest(){
        //: Given
        Numbers numbers = new Numbers();
        String expected = "*** Output ***\nsquares()\n1\n4\n9\n16\n25\n36\n49\n64\n81\n100";

        //: When
        String actual = numbers.squares();

        //: Then
        Assert.assertEquals("The two strings are equal", expected, actual);
    }

    @Test
    public void random4Test(){
        //: Given
        Numbers numbers = new Numbers();
        String expectedLine1 = "*** Output ***";
        String expectedLine2 = "random4()";

        //: When
        String actual = numbers.random4();
        String[] actLines = actual.split("\n");
        String actualLine1 = actLines[0];
        String actualLine2 = actLines[1];
        int num1 = Integer.parseInt(actLines[2]);
        int num2 = Integer.parseInt(actLines[3]);
        int num3 = Integer.parseInt(actLines[4]);
        int num4 = Integer.parseInt(actLines[5]);


        //: Then
        Assert.assertEquals("The two strings are equal", expectedLine1, actualLine1);
        Assert.assertEquals("The two strings are equal", expectedLine2, actualLine2);
        Assert.assertTrue(1<=num1 && num1<=10);
        Assert.assertTrue(1<=num2 && num2<=10);
        Assert.assertTrue(1<=num3 && num3<=10);
        Assert.assertTrue(1<=num4 && num4<=10);
    }

    @Test
    public void evenTest(){
        //: Given
        Numbers numbers = new Numbers();
        String expected = "*** Output ***\neven(int n)\n2\n4\n6\n8\n10\n12\n14\n16\n18";

        //: When
        String actual = numbers.even(20);

        //: Then
        Assert.assertEquals("The two strings are equal", expected, actual);
    }

    @Test
    public void powersTest(){
        //: Given
        Numbers numbers = new Numbers();
        String expected = "*** Output ***\npowers(int n)\n2\n4\n8\n16\n32\n64\n128\n256";

        //: When
        String actual = numbers.powers(8);

        //: Then
        Assert.assertEquals("The two strings are equal", expected, actual);
    }

}
