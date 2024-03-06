package io.zipcoder.microlabs.mastering_loops;

public class TriangleUtilities {

    public static String getTriangle(int numberOfRows) {
        String result ="";
        for(int i =1; i<=numberOfRows;i++){
            result += getRow(i)+"\n";
        }

        return result;
    }

    public static String getRow(int numberOfStars) {
        String result ="";
        for (int i =0;i<numberOfStars;i++){
            result = result +"*";
        }
        return result;

    }

    public static String getSmallTriangle() {
        String result ="";
        int numberOfRows =4;
        for(int i =1; i<=numberOfRows;i++){
           result += getRow(i)+"\n";
            }

        return result;
    }

    public static String getLargeTriangle() {
        String result ="";
        int numberOfRows = 10;
        for (int i =1;i<=numberOfRows;i++){
            String numberOfStars = "";
            for (int j=0;j<i;j++){
                numberOfStars = numberOfStars + "*";
            }
            result = result +numberOfStars+"\n";

        }
        System.out.println(result);
        return result;
    }
}
