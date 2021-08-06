package com.company.string;

import com.company.string.Animal.Animal;
import com.company.string.Animal.DogInf;
import com.company.string.Animal.CatInf;

import java.util.ArrayList;
import java.util.Scanner;

public class AnimalApp {

    public static void main(String[] args) {
        ArrayList<Animal> animal = new ArrayList<>();
        read(animal);
        MaxMin(animal);
        System.out.println("Bullshit");
    }

    public static void read(ArrayList<Animal> animal) {
        Scanner animRead = new Scanner(System.in);
        String line;

        for (; ; ) {
            line = animRead.nextLine();
            String[] oneAnimal = line.split(" ");
            if ("Cat".equals(oneAnimal[0])) {
                int age = Integer.parseInt(oneAnimal[2]);
                CatInf cat = new CatInf(oneAnimal[1], age);
                animal.add(cat);
            } else {
                if ("Dog".equals(oneAnimal[0])) {
                    int age = Integer.parseInt(oneAnimal[2]);
                    DogInf dog = new DogInf(oneAnimal[1], age);
                    animal.add(dog);
                } else {
                    break;
                }
            }
        }
        animRead.close();
    }

    public static void test1() {
        ArrayList<Animal> animals = new ArrayList<>();

        animals.add(new CatInf("asdasfd", 3));
        animals.add(new DogInf("feaf", 6));
        animals.add(new CatInf("gegy", 5));
        animals.add(new CatInf("hehe", 4));

        MaxMin(animals);
    }

    public static void MaxMin(ArrayList<Animal> animals) {

        Animal minAgeAnimal = animals.get(0);
        Animal maxAgeAnimal = animals.get(0);

        for (Animal animal : animals) {
            if (animal.getAge() > maxAgeAnimal.getAge()) {
                maxAgeAnimal = animal;
            }
            if (animal.getAge() < minAgeAnimal.getAge()) {
                minAgeAnimal = animal;
            }
        }

        String textMin = "Самое молодое животное - " + minAgeAnimal.getStringRepr() + " " + minAgeAnimal.getName();
        System.out.println(textMin);
        String textMax = "Самое взрослое животное - " + maxAgeAnimal.getStringRepr() + " " + maxAgeAnimal.getName();
        System.out.println(textMax);
    }
}

