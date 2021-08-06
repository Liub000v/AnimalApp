package com.company.string.Animal;

public class DogInf implements Animal{
    private final String name;
    private final int age;

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

    @Override
    public String getStringRepr() {
        return "собака по имени";
    }
}
