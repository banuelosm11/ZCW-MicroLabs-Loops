package io.zipcoder.microlabs.mastering_loops;

import java.io.InputStream;
import java.util.Scanner;

public class CarRide {

    Scanner in;

    public CarRide(InputStream scannerIn){
        in = new Scanner(scannerIn);
    }

    public String areWeThereYet() {

        String input = in.next();

        while(!input.equalsIgnoreCase("Yes"))
        {
                System.out.println("\"Are we there yet?\"");
                input = in.next();
            }

        return "Good!";

    }

}
