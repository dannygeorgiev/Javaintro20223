package programming.intro;

import java.util.Scanner;

public class Intro {
    public static void main(String[] args) {
        System.out.println("Please enter your name");

        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();

        System.out.println("HI, " + name);

        System.out.println("Please enter your age");

        int age = scanner.nextInt();

        if (age >= 18) {
            System.out.println(name + " is able to drink.");
        }
        else {
            System.out.println(name + " is NOT able to drink");

        }

    }
}
