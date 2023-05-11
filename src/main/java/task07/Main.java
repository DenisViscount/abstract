package task07;

public class Main {

    public static void main(String[] args) {


        int [] array = {1,5,3,8,4,0,1};
        getString(array);


        }

       public static String getString(int [] array){

        StringBuilder s = new StringBuilder();

        for (int i = 1; i < array.length; i++) {
            s.append(i + " ");
        }
        String str = s.toString();

           System.out.println(str);

        return str;



    }


}
