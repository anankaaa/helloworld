package solutions;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("First number?");
        int firstNumber = scanner.nextInt();
        System.out.println("Second number?");
        int secondNumber = scanner.nextInt();
        System.out.println(firstNumber + "+" + secondNumber);
        System.out.println(firstNumber + secondNumber);
    }
}


/*Gyakorlati feladat - Számológép
Készíts egy Calculator osztályt a classstructureio csomagba!
A main metódusban kérj be a felhasználótól két egész számot! Az első sorban írd ki
a műveletet a következő formátumban: 5 + 10! A második sorban írd ki az eredményt (15)!*/