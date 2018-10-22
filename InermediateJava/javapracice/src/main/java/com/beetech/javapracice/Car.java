package com.beetech.javapracice;

public class Car {

    public String colour = "Black";
    private int mNumberOfSeats =5;
    protected String mInterior;





    public Car(){
        mInterior = "Leather";
    }
    public Car(String chosenColour,String  chosenInterior){
        colour = chosenColour;
        mInterior = chosenInterior;
    }

    public int getNumberOfSeats() {
        return mNumberOfSeats;
    }

    public String getInterior() {
        return mInterior;
    }

    public void drive(){
        System.out.println("Car is moving");
    }

}

