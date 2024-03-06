package io.zipcoder.microlabs.mastering_loops;

public class TableUtilities {
    public static String formatNum(int num){
        String num1 = String.valueOf(num);
        int len = num1.length();
        if(len == 1){
            return "  "+num1+" ";
        }
        else if(len == 2){
            return " "+num1+" ";
        }
        else if(len == 3){
            return num1+" " ;
        }
        else{
            return num1;
        }


    }

    public static String getSmallMultiplicationTable() {
        return getMultiplicationTable(5);
    }

    public static String getLargeMultiplicationTable() {
        return getMultiplicationTable(10);

    }

    public static String getMultiplicationTable(int tableSize) {
        String result ="";
        for (int i =1;i<=tableSize;i++){
            for(int j=1;j<=tableSize;j++){
                result += formatNum(j*i)+"|";
            }
            result += "\n";

        }

        return result;
    }
}
