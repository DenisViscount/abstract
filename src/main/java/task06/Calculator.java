package task06;

public class Calculator {

    public static double totalArea(Figure [][] arrayFigures){
        double totalSquare = 0;

        for (int i = 0; i < arrayFigures.length; i++) {

                totalSquare = totalSquare + Calculator.totalSquare(arrayFigures[i]) ;

        }
        return totalSquare;

    }

    private static double totalSquare(Figure[] figures) {
        double totalSquare = 0;
        for (int i = 0; i < figures.length; i++) {
            totalSquare = totalSquare + figures[i].square();

        }
        return totalSquare;
    }

//    public static double totalArea(Figure [][] arrayFigures){
//        double totalSquare = 0;
//
//          for (int i = 0; i < arrayFigures.length; i++) {
//
//
//            for (int j = 0; j < arrayFigures.length; j++) {
//
//                totalSquare = totalSquare + arrayFigures[i][j].square();
//
//            }
//
//        }
//        return totalSquare;
//
//    }

}
