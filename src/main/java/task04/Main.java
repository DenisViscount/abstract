package task04;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        String [] strArray = {"file.txt","file.exe","name.xls","name.doc","bob.txt","den.txt"};
        String [] fileNameArray = createArray(strArray);
        System.out.println(Arrays.toString(fileNameArray));

    }
    public static String [] createArray(String [] strArray){
        ArrayList<String> strList = new ArrayList<String>();
        for (int i = 0; i < strArray.length; i++) {
            int dotIndex = strArray[i].lastIndexOf(".");
            String fileName = strArray[i].substring(0,dotIndex);
            strList.add(fileName);

        }


        return strList.toArray(new String[strList.size()]);
    }

}
