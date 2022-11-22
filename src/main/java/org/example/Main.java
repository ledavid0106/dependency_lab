package main.java.org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Katana katana = new Katana();
        Robot robot_one = new Robot("Alpha", katana);
        System.out.println(robot_one.name);
        robot_one.Attack();
        Bow bow = new Bow();
        Robot robot_two = new Robot("Beta",bow);
        System.out.println(robot_two.name);
        robot_two.Attack();
        Lightsaber lightsaber = new Lightsaber();
        Robot robot_three = new Robot("Gamma",lightsaber);
        System.out.println(robot_three.name);
        robot_three.Attack();
    }

}