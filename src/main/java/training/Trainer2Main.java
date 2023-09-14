package training;

import java.util.Scanner;

public class Trainer2Main {
    public static void main(String[] args) {
        System.out.println("What is your name?");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        System.out.println("Year of birth?");
        int yearOfBirth = scanner.nextInt();

        Trainer2 trainer2 = new Trainer2(name, yearOfBirth);
        System.out.println(trainer2.getYearOfBirthAndName());
    }

}
