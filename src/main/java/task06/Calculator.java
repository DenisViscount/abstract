package task06;

public class Calculator {
    public static double totalArea(Figure [][] arrayFigures){
        double totalSquare = 0;

        for (int i = 0; i < arrayFigures.length; i++) {


            for (int j = 0; j < arrayFigures.length; j++) {

                totalSquare = totalSquare + arrayFigures[i][j].square();

            }

        }
        return totalSquare;

    }



}
