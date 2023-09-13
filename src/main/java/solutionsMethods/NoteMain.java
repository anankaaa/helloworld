package solutionsMethods;

public class NoteMain {
    public static void main(String[] args) {
        Note note = new Note();
        note.setName("Andrea");
        note.setText("ez a text");
        note.setTopic("ez a topic");
        System.out.println(note.getNoteText());
    }

}


/*  Gyakorlati feladat - Jegyzeteljünk!
Készíts egy Note osztályt, melyben a felhasználó rövid szöveges
jegyzetét tárolod. Tárolni kell a felhasználó nevét (name),
a jegyzet témáját (topic) és szövegét (text).
Fejlesztés során ezentúl mindig tartsd be az information hiding elvet,
azaz az attribútumok legyenek privátak, és készíts hozzájuk gettereket és settereket!
Készíts egy getNoteText() metódust, mely az osztály attribútumai
alapján egyetlen szöveget ad vissza name: (topic) text formátumban!

Teszteld az osztályod a NoteMain osztály main() metódusából!
A Note tartalmának megjelenítésekor használd a getNoteText() metódust!
*
* */