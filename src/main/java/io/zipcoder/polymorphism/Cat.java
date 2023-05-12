package io.zipcoder.polymorphism;

public class Cat extends Pet{

    private String name;
    private String sound;

    public Cat(String name, String sound) {
        this.name = name;
        this.sound = sound;
    }

    @Override
    public void speak() {
        super.speak();
        System.out.println(sound);
    }
}
