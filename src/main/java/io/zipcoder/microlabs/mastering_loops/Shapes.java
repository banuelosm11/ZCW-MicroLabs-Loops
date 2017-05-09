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
        return "";
    }

    public String tableSquares(int n){
        return "";
    }
}
