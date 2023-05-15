package io.zipcoder.polymorphism;

public class Dinosaur extends Pet{

    private String name;
    private String typeOfPet;

    public Dinosaur(String name, String typeOfPet) {
        super(name, typeOfPet);
        this.name = name;
        this.typeOfPet = typeOfPet;
    }

    @Override
    public String speak() {
        return "ROARRRRRR";
    }
}
