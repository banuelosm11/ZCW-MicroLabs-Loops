package io.zipcoder.microlabs.mastering_loops;


public class Numbers {

    public String oneToTen() {

        String output = "*** Output ***\noneToTen()";

        for (int i = 1; i < 11; i++) {
            output = output + "\n" + i ;
        }

        return output;
    }

    public String oddNumbers(){

        String output = "*** Output ***\noddNumbers()";

        for(int i = 1; i < 21; i++){
            if(i%2 == 0){
                continue;
            }else{
                output = output + "\n" + i ;
            }
        }
        return output;
    }

    public String squares(){

        String output = "*** Output ***\nsquares()";

        for(int i = 1; i < 11; i++){
            output = output + "\n" + (i*i);
        }

        return output;
    }

//    public String random4(){
//
//        String output = "*** Output ***\nrandom4()";
//
//        for(int i = 1; i < 11; i++){
//            output = output + "\n" + ;
//        }
//
//        return output;
//    }

    public String even(int n){

        String output = "*** Output ***\neven(int n)";

        for(int i = 1; i < n; i++){
            if(i % 2 == 0){
                output = output + "\n" + i;
            }
        }

        return output;
    }

    public String powers(int n){

        String output = "*** Output ***\npowers(int n)";

        for (int i = 1; i < n+1 ; i++){
            output = output + "\n" + (int) Math.pow(2, i);
        }

        return output;
    }

}
