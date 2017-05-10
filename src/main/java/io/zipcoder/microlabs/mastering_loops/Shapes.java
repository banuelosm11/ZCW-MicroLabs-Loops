package io.zipcoder.microlabs.mastering_loops;


public class Shapes {

    public String triangle(){

        String output = "*** Output ***\ntriangle()\n";

        for (int i = 1; i < 6; i++) {
            for (int j = 1; j < i+1; j++){
                output += "*";
            }
        output += "\n";
        }
        return output;
    }

    public String tableSquare(){

        String output = "*** Output ***\ntableSquare()\nA 4 x 4 table square\n";

        for (int i = 1; i < 5; i++){
            for (int j = 1; j < 5; j++){
                output = output + "| " + i*j + " ";
            }
            output += "|\n";
        }
        return output;
    }

    public String tableSquares(int n){
        return "";
    }
}
