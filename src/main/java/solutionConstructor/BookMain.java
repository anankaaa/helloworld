package solutionConstructor;

public class BookMain {
    public static void main(String[] args) {
        Book book = new Book("Agatha Christie", "Orient Express");
        System.out.println(book.getAuthor());
        System.out.println(book.getTitle());

        book.register("123");
        System.out.println(book.getRegNumber());
    }
}
/* Gyakorlati feladat - Könyv regisztráció
Hozz létre egy Book osztályt, melynek három privát attribútuma van:
szerző (author), cím (title) és regisztrációs szám (regNumber), mindhárom típusa String.

A Book példányosításakor csak a szerzőt és a címet kelljen megadni.

Legyen egy public void register(String regNumber) metódusa,
mely a nyilvántartásba vételt implementálja, és ennek paraméterül kell megadni
a regisztrációs számot.

Írj egy main() metódust a BookMain osztályba,
amivel kipróbálod a működését! Az attribútumok kiolvasásához használj gettereket! */