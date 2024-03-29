package io.zipcoder.polymorphism;

public class Dog extends Pet{

    private String name;
    private String typeOfPet;

    public Dog(String name, String typeOfPet) {
        super(name, typeOfPet);
        this.name = name;
        this.typeOfPet = typeOfPet;
    }

    @Override
    public String speak() {
        return "Woof woof";
    }
}
