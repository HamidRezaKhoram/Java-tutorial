package com.animals;

public abstract class Reptile implements ZooMaker {
    double reptileWeight;
    String reptileSpecies;
    static int numberOfreptile;
    String colorOfreptile;

    Reptile() {

    }


    Reptile(double weight, String species, String color) {
        reptileWeight = weight;
        reptileSpecies = species;
        colorOfreptile = color;
    }

    void sleepInCoold() {
      System.out.println("Reptiles sleep in cold");

    }
}

class Snake extends Reptile{
    public void isItDeadly(){
        System.out.println("yes, depends");
    }
    public void isItIndengear(){

        System.out.println("no");
    }
    public void ticketPrice(){
        System.out.println(medioumPriceTicket);
    }
    Snake(){
        reptileSpecies = "Alligator";

    }
    Snake(double weight, String color){
        reptileWeight =  weight;
        colorOfreptile = color;
    }



}


class Lizard extends Reptile{
    public void isItDeadly(){
        System.out.println("no");
    }
    public void isItIndengear(){

        System.out.println("no");
    }
    public void ticketPrice(){
        System.out.println(lowPriceTicket);
    }
    Lizard(){
        reptileSpecies = "Alligator";

    }
    Lizard(double weight, String color){
        reptileWeight =  weight;
        colorOfreptile = color;
    }

}

class Alligator extends Reptile {
    public void isItDeadly() {
        System.out.println("yes");
    }

    public void isItIndengear() {

        System.out.println("no");
    }

    public void ticketPrice() {
        System.out.println(highPriceTicket);
    }
    Alligator(){
        reptileSpecies = "Alligator";

    }
    Alligator(double weight, String color){
        reptileWeight =  weight;
                colorOfreptile = color;
    }

    public void bestKillreofOurZoo(){
        System.out.println("it will eat anything");

    }

}