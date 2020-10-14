package com.letsupgrade;

public class Avenger {
    private String name;
    private int age;
    private String power;
    private String weapon;
    private String planet;

    public Avenger(String name, int age, String power, String weapon, String planet) {
        this.name = name;
        this.age = age;
        this.power = power;
        this.weapon = weapon;
        this.planet = planet;
    }
    public Avenger getDetails(){
        return new Avenger(name, age, power, weapon, power);
    }
    public void displayDetails(){
        System.out.println("==============================");
        System.out.println("\tName   : " + name);
        System.out.println("\tAge    : " + age);
        System.out.println("\tpower  : " + power);
        System.out.println("\tWeapon : " + weapon);
        System.out.println("\tPlanet : " + planet);
        System.out.println("==============================");
    }
}
