package main.java.org.example;

public class Robot {


    //Instance variables (HAS A)
    public String name;
    public Weapon weapon;

    //Constructor


    public Robot(String name, Weapon weapon) {
        this.name = name;
        this.weapon = weapon;
    }

    public void Attack(){
        System.out.println(this.name + " attacks with their " + this.weapon.name + " for " + this.weapon.power + " damage!");
    }
}