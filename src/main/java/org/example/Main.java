package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        checkAge(18);

    }

    public static void checkAge(int age) {
        if (age > 18) {
            System.out.println("Over 18");
        } else if (age == 18){
            System.out.println("exactly 18");
        } else {
            System.out.println("Under 18");
        }
    }


}