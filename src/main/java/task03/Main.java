package task03;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String [] strArray = {"file.txt","file.exe","name.xls","name.doc","bob.txt","den.txt"};
        String [] filterArray = createArray(strArray);
        System.out.println(Arrays.toString(filterArray));

    }
    public static String [] createArray(String [] strArray){
        ArrayList<String> filterList = new ArrayList<String>();

        for (int i = 0; i < strArray.length; i++) {

            if(strArray[i].endsWith(".txt")){
                filterList.add(strArray[i]);

            }
        }

        return filterList.toArray(new String[filterList.size()]);
    }
}
