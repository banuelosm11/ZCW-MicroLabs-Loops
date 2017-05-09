package io.zipcoder.microlabs.mastering_loops;

import java.util.Scanner;

public class CarRide {

    public String areWeThereYet() {
        Scanner in = new Scanner(System.in);

        String output = "\"Are we there yet?\"";

        System.out.println(output);
        String input = in.next();
        output = output + "\n" + input;

        while(!input.equalsIgnoreCase("Yes"))
        {
                System.out.println("\"Are we there yet?\"");
                input = in.next();
                output = output + "\n\"Are we there yet?\"\n" + input;
            }

        System.out.println("Good!");

        output = output + "\n" + "Good!";

       // System.out.println(output);

        return output;

    }

}
