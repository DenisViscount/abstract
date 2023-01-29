package task04;

import java.util.Random;

public  class Car {
    static final int INITIAL_FUEL_AMOUNT = 150;
    static final int CONSUMPTION_PER = 100;
    private double fuelAmount;
    private String model;
    private int speed;
    private double breakageProbability;
    private double fuelConsumption;

    public Car(String model, int speed, double breakageProbability, double fuelConsumption) {
        this.model = model;
        this.speed = speed;

        this.breakageProbability = breakageProbability;
        this.fuelConsumption = fuelConsumption;
    }

    public int drive(int distance){
        double fuelConsumptionPerStep =  (speed * fuelConsumption)/ CONSUMPTION_PER;
        int steps = 0;
        Random random = new Random();
        while(distance > 0) {
            steps++;
            double randomProbability = random.nextDouble();
            if (randomProbability <= breakageProbability) {

                continue;
            }
            if(fuelAmount < fuelConsumptionPerStep ){
                fuelAmount = INITIAL_FUEL_AMOUNT;

                continue;
            }
            distance = distance - speed;
            fuelAmount = fuelAmount - fuelConsumptionPerStep;
        }

        return steps;

    }


}
