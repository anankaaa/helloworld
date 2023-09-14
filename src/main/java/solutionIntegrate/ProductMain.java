package solutionIntegrate;

import java.util.Scanner;

public class ProductMain {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("What is the product?");
        String name = scanner.nextLine();
        System.out.println("What is the price of it?");
        int price = scanner.nextInt();

        Product product= new Product(name, price);
        System.out.println(product.getPrice());
        System.out.println(product.getName());
        product.increasePrice(6);
        System.out.println(product.getPrice());
        product.decreasePrice(2);
        System.out.println(product.getPrice());
    }
}


