package com.company.string;
import com.company.string.Animal.Animal;
import com.company.string.Animal.DogInf;
import com.company.string.Animal.CatInf;

import java.util.ArrayList;
import java.util.Scanner;

public class AnimalApp {
    public static void main(String[] args) {
        ArrayList<Animal> animal = new ArrayList<Animal>();
        read(animal);
        MaxMin(animal);
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

    public static void MaxMin(ArrayList<Animal> animal){
        Animal FirstAnimal = animal.get(1);
        int min = FirstAnimal.getAge();
        int max = 0;
        for (int i = 0; i < animal.size(); i++) {
            Animal oneAnimal = animal.get(i);
            int m = oneAnimal.getAge();
            max = (m > max) ? m : max;
            min = (m < min) ? m : min;
        }
        for (int i = 0; i < animal.size(); i++) {
            Animal oneAnimal = animal.get(i);
            if (min == oneAnimal.getAge()) {
                String textMin = "Самое молодое животное - " + oneAnimal.toString() + " " + oneAnimal.getName();
                System.out.println(textMin);
            }
            if (max == oneAnimal.getAge()) {
                String textMax = "Самое взрослое животное - " + oneAnimal.toString() + " " + oneAnimal.getName();
                System.out.println(textMax);
            }
        }
    }
}

