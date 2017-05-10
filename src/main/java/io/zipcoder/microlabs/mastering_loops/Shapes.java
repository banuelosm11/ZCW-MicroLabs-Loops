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
                if(i*j >= 10) {
                        output = output + "| " + i * j + " ";
                }
                else if (i*j < 10){
                    if(j>=3) {
                        output = output + "|  " + i * j + " ";
                    }else{
                        output = output + "| " + i * j + " ";
                    }
                }
            }
            output += "|\n";
        }
        return output;
    }

    public String tableSquares(int n){

        String output = "*** Output ***\ntableSquares()\nA " + n + " x " + n + " table square\n";

        for (int i = 1; i < n+1; i++){
            for (int j = 1; j < n+1; j++){
                if(i*j >= 10) {
                    output = output + "| " + i * j + " ";
                }
                else if (i*j < 10){
                    if(j>=2) {
                        output = output + "|  " + i * j + " ";
                    }else{
                        output = output + "| " + i * j + " ";
                    }
                }
            }
            output += "|\n";
        }
        return output;

    }
}
