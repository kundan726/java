package com.letsupgrade;;

public class Main {
    public static void main(String[] args) {
        Avenger cap = new Avenger("Captain America", 65, "Durability", "Shield", "Earth");
        Avenger Groot = new Avenger("I am Groot", 5, "Tree spirit", "Roots", "Planet X");
        Avenger tony = new Avenger("Iron Man", 30, "Technology", "Iron suit", "Earth");
        Avenger gamora = new Avenger("Gamora", 25, "Quickness", "Sword", "Titan");
        Avenger thor = new Avenger("All Father Thor", 2000, "Thunder", "Storm Breaker", "Asgard");
        cap.displayDetails();
        Groot.displayDetails();
        tony.displayDetails();
        gamora.displayDetails();
        thor.displayDetails();
    }
}
