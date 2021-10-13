package com.animals;

public abstract class Birds implements ZooMaker {
    double birdWeight;
    String birdSpecies;
    boolean canFly;
    boolean layEggs;
    static int numberOfBirds;
    String colorOfBird;
    Birds(){
        this(0, "unknown", false, true,"unknown");
    }
    Birds(boolean fly){
        this();
        canFly = fly;
    }
    Birds(double weight){
        this(weight, "unknown", false, true,"unknown");
    }
    Birds(String species){
        this();
        birdSpecies = species;
    }
    Birds(double weight, String species)
    {
       this(weight, species, false, true,"unknown");
    }
    Birds(double weight, String species, boolean fly, boolean egg, String color) {
        birdWeight = weight;
        birdSpecies = species;
        canFly = fly;
        layEggs = egg;
        colorOfBird = color;

    }
    void fly(){
        if(canFly) {
            System.out.println(birdSpecies + " can fly!!!");
        }
        else{
            System.out.println(birdSpecies + " can not fly");
        }

        }

    void sleepOnEggs(){
        if (layEggs == true){
            perotectChildren();
        }

    }
    void perotectChildren(){
        System.out.println("this " + birdSpecies + " protect their children by sitting on them");
    }
    void addBirds(int add){
        numberOfBirds = numberOfBirds + add;
    }
    void resetBirds(int reset){
        numberOfBirds = reset;
    }
    }


 class Bat extends Birds {
     public void isItDeadly(){
         System.out.println("yes");
     }
     public void isItIndengear(){
         System.out.println("no");
     }
     public void ticketPrice() {
         System.out.println(lowPriceTicket);
     }
    boolean childBearing;
    Bat(){
        super();
        childBearing = true;
       canFly = true;
       layEggs = false;
        birdSpecies = "Bat";
    }
     Bat(double weight, String color){
        this();
         birdWeight = weight;
         colorOfBird = color;
     }
    void nightVision(){
        System.out.println(birdSpecies + " can see in night");
    }

     @Override
     void sleepOnEggs() {
         if (layEggs == false || childBearing) {
             perotectChildren();
         }
     }
     @Override
     void perotectChildren(){
         System.out.println(birdSpecies + " protect their children by other means");
     }

     @Override
     void fly() {
         super.fly();
         System.out.println("but " + birdSpecies + "are not good flyers");
     }
 }

   class Penguin extends Birds{
       public void isItDeadly(){
           System.out.println("no");
       }
       public void isItIndengear(){
           System.out.println("no");
       }
       public void ticketPrice() {
           System.out.println(lowPriceTicket);
       }

    Penguin() {
        super();
        birdSpecies = "Penguin";
        layEggs = true;
        canFly = false;
    }
       Penguin(double weight, String color){
           birdWeight = weight;
           colorOfBird = color;
       }

        void swim() {
            System.out.println(birdSpecies + " can swim");
        }

   }

    class Parrot extends Birds{
        public void ticketPrice() {
            System.out.println(lowPriceTicket);
        }
        public void isItDeadly(){
            System.out.println("no");
        }
        public void isItIndengear(){
            System.out.println("yes");
        }
    Parrot(){
        super();
        birdSpecies = "Parrot";
                layEggs = true;
        canFly = true;
    }
        Parrot(double weight, String color){
                birdWeight = weight;
                colorOfBird = color;
        }

     void speek(){
        System.out.println(birdSpecies + " can talk");
     }
    }



