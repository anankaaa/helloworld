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
