package io.zipcoder.polymorphism;

public class Cat extends Pet{

    private String name;
    private String typeOfPet;

    public Cat(String name, String typeOfPet) {
        super(name, typeOfPet);
        this.name = name;
        this.typeOfPet = typeOfPet;
    }

    @Override
    public String speak() {
        return "Meow";
    }
}
