package com.company.string.Animal;

public class DogInf implements Animal{
    private String name;
    public int age;

    public DogInf(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        String line = "собака по имени";
        return line;
    }
}
