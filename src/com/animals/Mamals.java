package com.animals;
 public abstract class Mamals implements ZooMaker {
    double mamalWeight;
    String mamalSpecies;
    boolean canFly;
    boolean canSwim;
    String methodOfChildBearing;
    static int numberOfMamal;
    String colorOfMamal;

    Mamals(){
        colorOfMamal = "unkown";
        mamalSpecies = "unkown";
        methodOfChildBearing = "womb";
    }
    Mamals(double weight, String name, boolean fly, boolean swim, String child, String color){
        mamalWeight = weight;
        mamalSpecies = name;
        canFly = fly;
        canSwim = swim;
        methodOfChildBearing = child;
        colorOfMamal = color;
    }
    abstract void swim();
    abstract void fly();
    abstract void run();

}

class Elephent extends Mamals{

    Elephent(){
        super();
        mamalSpecies = "Elephent";
        canFly = false;
        canSwim = false;
    }
    Elephent(double weight, String color){
        colorOfMamal = color;
        mamalWeight = weight;
    }

    public void isItDeadly(){
        System.out.println("yes");
    }
    public void isItIndengear(){
        System.out.println("yes");
    }
    public void ticketPrice() {
        System.out.println(highPriceTicket);
    }
    void swim(){
        System.out.println("cannot swim");
    }
    void fly(){System.out.println("cannot fly");}
    void run(){System.out.println("can run");}
}


class Platypus extends Mamals{
    public void isItDeadly(){
        System.out.println("no");
    }
    public void isItIndengear(){
        System.out.println("no");
    }
    public void ticketPrice() {
        System.out.println(highPriceTicket);
    }

    Platypus(){
        super();
        mamalSpecies = "Platypus";
        canFly = false;
        canSwim = true;
    }
    Platypus(double weight, String color){
        colorOfMamal = color;
        mamalWeight = weight;
    }

    void swim(){
        System.out.println("can swim");
    }
    void fly(){System.out.println("cannot fly");}
    void run(){System.out.println("can run");}
}

class Dolpyin extends Mamals{

    public void ticketPrice() {
        System.out.println(medioumPriceTicket);
    }
    public void isItDeadly(){
        System.out.println("no");
    }
    public void isItIndengear(){
        System.out.println("no");
    }
    Dolpyin(){
        super();
        mamalSpecies = "Dolpyin";
        canFly = false;
        canSwim = true;
    }
    Dolpyin(double weight, String color){
        colorOfMamal = color;
        mamalWeight = weight;
    }


     void swim(){
        System.out.println("can swim");
    }
    void fly(){System.out.println("cannot fly");}
    void run(){System.out.println("cannot run");}
}