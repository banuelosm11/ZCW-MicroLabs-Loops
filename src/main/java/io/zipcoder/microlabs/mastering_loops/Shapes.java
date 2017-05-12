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
        return output.trim();
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
        return output.trim();
    }

    public String tableSquares(int n) {

        String output = "*** Output ***\ntableSquares()\nA " + n + " x " + n + " table square\n";

        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < n + 1; j++) {
                if(digitsInNumber(i*j) > 1){
                    output = output + "|" + " " + i * j + " ";
                }else if(digitsInNumber(i*j) == 1 && digitsInNumber(j)==1){
                    output = output + "|" + " " + i * j + " ";
                }else if (digitsInNumber(i*j) == 1 && digitsInNumber(j)>1){
                    output = output + "|" + addSpace(j) + i * j + " ";
                }
            }
            output += "|\n";
        }
        System.out.println(output);
        return output.trim();
    }

    public String addSpace(int j){
        String space = " ";
        int jDigit = digitsInNumber(j);

        for (int i = 0; i <jDigit-1 ; i++){
            space += " ";
        }
        return space;
    }

    int length;
    public int digitsInNumber(int num){
        length = (int)(Math.log10(num)+1);
        return length;
    }

}
