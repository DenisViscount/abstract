package task06;

public class Calculator {
    public static double totalArea(Figure[] figures,Figure[] figures1,Figure[] figures2){
        double totalSquare = totalSquare(figures) + totalSquare(figures1)+ totalSquare(figures2);
        return totalSquare;

    }




    private static double totalSquare(Figure[] figures) {
        double totalSquare = 0;
        for (int i = 0; i < figures.length; i++) {
            totalSquare = totalSquare + figures[i].square();

        }

        return totalSquare;
    }

}
