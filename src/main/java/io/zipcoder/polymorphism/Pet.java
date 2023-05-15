package io.zipcoder.polymorphism;

public class Pet {

    private String name;
    private String typeOfPet;

    public Pet(String name, String typeOfPet){
        this.name = name;
        this.typeOfPet = typeOfPet;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String speak() {
        return "This is my sound";
    }

    public String getTypeOfPet() {
        return typeOfPet;
    }

    public void setTypeOfPet(String typeOfPet) {
        this.typeOfPet = typeOfPet;
    }
}
