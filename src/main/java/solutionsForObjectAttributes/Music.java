package solutionsForObjectAttributes;

import java.util.Scanner;

public class Music {
    public static void main(String[] args) {
        Song song = new Song();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Who is the band of your fav song?");
        song.band = scanner.nextLine();
        System.out.println("What is the title of your fav song?");
        song.title = scanner.nextLine();
        System.out.println("How long is your fav song?");
        song.length=scanner.nextInt();

        System.out.println(song.band + "-" + song.title + " (" + song.length + "perc)");
    }
}
