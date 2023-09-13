package solutions;

import java.util.Scanner;

public class Registration {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = scanner.nextLine();
        System.out.println("What is your email ID?");
        String email = scanner.nextLine();
        System.out.println("Your registration details: " + name + ", " + email);
    }
}


/*  Gyakorlati feladat - Regisztráció
Készíts egy Registration osztályt a classstructureio csomagba!
A main metódusban kérd be
a felhasználótól a nevét és az email címét, majd írd ki,
hogy milyen adatokkal regisztrált!*/