package solutionsForObjectAttributes;

import java.util.Scanner;

public class ClientMain {
    public static void main(String[] args) {
        Client client = new Client();
        client.setName("Kiss Viri");
        System.out.println(client.getName());
        client.setYear(1983);
        System.out.println(client.getYear());
        client.migrate("Chicago");
        System.out.println(client.getAddress());
        client.migrate("New York");
        System.out.println(client.getAddress());
        /*scanner scanner = new scanner(system.in);
        system.out.println("what is your name?");
        client.name = scanner.nextline();
        system.out.println("what is your birth year?");
        client.year = scanner.nextint();
        scanner.nextline();
        system.out.println("what is your address?");
        client.address = scanner.nextline();

        system.out.println(client.name + " " + client.year + " " + client.address);*/
    }
}

/* Gyakorlati feladat - Ügyfél nyilvántartás
Hozz létre egy Client osztályt, melynek három attribútuma van:
név (name), születési év (year) és cím (address). Típusaik rendre String, int és String.

Hozz létre egy main() metódust a ClientMain osztályba, amelyben kipróbálod
a Client osztály működését. Példányosítani kell egy objektumot
a Client osztály alapján, majd kérd be az attribútumok értékét a felhasználótól.
Ellenőrzésképp írd ki minden attribútumának értékét a konzolra! */
