package solutionConstructor;

public class StoreMain {

    public static void main(String[] args) {
        Store bookStore = new Store("book");
        bookStore.store(5);
        System.out.println(bookStore.getProduct());
        System.out.println(bookStore.getStock());
        bookStore.dispatch(2);
        System.out.println(bookStore.getStock());

        Store paperStore = new Store("paper");
        paperStore.store(15);
        System.out.println(paperStore.getProduct());
        System.out.println(paperStore.getStock());
        paperStore.dispatch(1);
        System.out.println(paperStore.getStock());
    }
}

/* Gyakorlati feladat - Raktárkészlet
Készíts egy Store osztályt, mely egy raktárt modellez.
A raktár jellemzője az, hogy miből (product) és
aktuálisan mekkora mennyiséget (stock) tárol.
(Ennek a raktárnak speciális jellemzője, hogy csak egyféle terméket tud tárolni.)
Az első attribútuma String, a második int típusú.

A Store példányosításakor elég megadni a tárolt terméket,
a mennyiség mindig 0, ezért a konstruktor csak a terméket kapja meg kívülről.

Készíts hozzá két metódust, mely a tárolt mennyiséget változtatja:
a store() metódusa a paraméterként kapott mennyiséget eltárolja a
raktárban növelve ezzel a készletet, míg a dispatch() metódusa
az elszállítást modellezi, azaz a paraméterként kapott mennyiséggel
csökkenti a készletet! (Most még nem kell ellenőrizned,
hogy elszállításkor van-e a raktárban elegendő mennyiségű terméked.)

A StoreMain osztály main() metódusában készíts két Store példányt,
és teszteld, hogy mindkét raktár helyesen és függetlenül működik-e
be- és kiszállítás esetén is! */
