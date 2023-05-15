package io.zipcoder.polymorphism;

public class Bird extends Pet{

    private String name;
    private String typeOfPet;

    public Bird(String name, String typeOfPet) {
        super(name, typeOfPet);
        this.name = name;
        this.typeOfPet = typeOfPet;
    }

    @Override
    public String speak() {
        return "Cacaw!";
    }
}
