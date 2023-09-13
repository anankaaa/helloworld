package solutionsForObjectAttributes;

import java.util.Scanner;

public class ClientMain {
    public static void main(String[] args) {
        Client client = new Client();
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your name?");
        client.name = scanner.nextLine();
        System.out.println("What is your birth year?");
        client.year = scanner.nextInt();
        scanner.nextLine();
        System.out.println("What is your address?");
        client.address = scanner.nextLine();

        System.out.println(client.name + " " + client.year + " " + client.address);
    }
}

/* Gyakorlati feladat - Ügyfél nyilvántartás
Hozz létre egy Client osztályt, melynek három attribútuma van:
név (name), születési év (year) és cím (address). Típusaik rendre String, int és String.

Hozz létre egy main() metódust a ClientMain osztályba, amelyben kipróbálod
a Client osztály működését. Példányosítani kell egy objektumot
a Client osztály alapján, majd kérd be az attribútumok értékét a felhasználótól.
Ellenőrzésképp írd ki minden attribútumának értékét a konzolra! */
