package io.zipcoder.polymorphism;

public class Dinosaur extends Pet{

    private String name;
    private String sound;

    public Dinosaur(String name, String sound) {
        this.name = name;
        this.sound = sound;
    }

    @Override
    public void speak() {
        super.speak();
        System.out.println(sound);
    }
}
