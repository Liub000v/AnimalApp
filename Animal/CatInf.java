package com.company.string.Animal;

public class CatInf implements Animal{
    private String name;
    public int age;

    public CatInf(String name, int age) {
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
        String line = "кот по имени";
        return line;
    }
}
