package Enum.task06;

public class Figure {
    private Colour colour;

    public Figure(Colour colour) {
        this.colour = colour;
        displayColour();
    }

    private void displayColour(){
        switch (colour){
            case RED:
                System.out.println("Figure is red");
                break;
            case BLUE:
                System.out.println("Figure is blue");
                break;
            case BLACK:
                System.out.println("Figure is black");
                break;
            default:
                System.out.println("Invalid colour");

        }
    }
}
