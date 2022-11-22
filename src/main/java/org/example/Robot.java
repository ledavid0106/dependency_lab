package main.java.org.example;

public class Robot {


    //Instance variables (HAS A)
    public String name;
    public Weapon weapon;

    //Constructor
    public Robot(Weapon weapon) {
        this.name = "Alpha";
        this.weapon = weapon;

    }

    public void Attack(){
        System.out.println(this.name + " attacks with their " + this.weapon.name + " for " + this.weapon.power + " damage!");
    }
}