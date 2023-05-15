package io.zipcoder.polymorphism;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainApplication {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("How many pets do you have?");
        int numberOfPets = scanner.nextInt();
        scanner.nextLine(); // consume the newline character left in the buffer


        List<Pet> myPets = new ArrayList<>(); //list that takes in pets inside the angle brackets


        for (int i = 1; i <= numberOfPets; i++) {
            System.out.println("What kind of pet is pet #" + i + "?");
            String typeOfPet = scanner.nextLine();
            System.out.println("What is pet #" + i + "'s name?");
            String petName = scanner.nextLine();


            Pet pet; // pet instance
            switch (typeOfPet) { //
                case "Dog": //checks if case matches the expression "Pet Type"
                    pet = new Dog(petName, typeOfPet); // new instance of pet - creates a dog and takes in a petName argument
                    break;
                case "Cat":
                    pet = new Cat(petName, typeOfPet);
                    break;
                case "Dinosaur":
                    pet = new Dinosaur(petName, typeOfPet);
                    break;
                case "Snake":
                    pet = new Snake(petName, typeOfPet);
                    break;
                case "Bird":
                    pet = new Bird(petName, typeOfPet);
                    break;
                default:
                    pet = new Pet(petName, typeOfPet); // default: you can create any pet type and give it a name
                    break;
            }
            myPets.add(pet); //adds the pets created to the pets list.
        }

        System.out.println("These are the pets you have:");
        for (Pet pet : myPets) { //loops through the pets created
            System.out.println("A " + pet.getTypeOfPet() + " named " + pet.getName()); //prints it "a (typeOfPet) named (petName))
        }

        System.out.println("No way! Your pets are talking! This is what they are trying to tell you: ");
        for (Pet pet : myPets) { //loops through pets created
            System.out.println("Your " + pet.getTypeOfPet() + " " + pet.getName() + " says " + pet.speak()); //prints out and lists what they say.
        }




    }
}
