package task04;
import java.util.Arrays;
import java.util.Scanner;

public  class ArrayInput {


    void sizeArray(){
         TypeData typeData;
         String sizeArray;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter size array");
        sizeArray = scanner.next();
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Input type date (SCANNER or RANDOM)" );
        typeData = TypeData.valueOf(scanner1.next());
        createArray(sizeArray, typeData);

    }
    private void createArray(String size, TypeData typeData){
        if(typeData == TypeData.RANDOM){
            Random random = new Random(size);
            System.out.println(Arrays.toString(random.getArrayRandom()));

        }else{
            Manually manually = new Manually(size);
            System.out.println(Arrays.toString(manually.getArrayScanner()));
        }

    }


}
