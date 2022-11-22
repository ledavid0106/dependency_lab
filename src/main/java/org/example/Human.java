package main.java.org.example;

public class Human implements Attacker{

    public String name;
    public int attackPower;

    public Human(String name, int attackPower) {
        this.name = name;
        this.attackPower = attackPower;
    }

    @Override
    public void Attack() {
        System.out.println(this.name + " attacks with their hands for " + this.attackPower + " damage!");
    }
}
