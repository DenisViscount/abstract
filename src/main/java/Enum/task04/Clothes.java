package Enum.task04;

public class Clothes {
    private Gender gender;
    private double size;
    private String colour;

    public Clothes(Gender gender, double size, String colour) {
        this.gender = gender;
        this.size = size;
        this.colour = colour;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }
}
