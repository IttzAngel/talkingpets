package io.zipcoder.polymorphism;

public class Snake extends Pet{

    private String name;
    private String typeOfPet;

    public Snake(String name, String typeOfPet) {
        super(name, typeOfPet);
        this.name = name;
        this.typeOfPet = typeOfPet;
    }

    @Override
    public String speak() {
        return "Hisssssss";
    }
}
