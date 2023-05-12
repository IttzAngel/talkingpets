package io.zipcoder.polymorphism;

public class MainApplication {

    public static void main(String[] args) {

        Cat cat = new Cat("Tom", "Meow");
        Dinosaur dinosaur = new Dinosaur("T-Rex", "ROARRRR");

        cat.speak();
        dinosaur.speak();



    }
}
