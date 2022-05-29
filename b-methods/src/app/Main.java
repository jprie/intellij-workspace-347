package app;

public class Main {

    // Diese Methode gibt es immer (1x pro Programm)
    public static void main(String[] args) {

        double result = sum(1.3, 2.5);
        System.out.println("Ergebnis: " + result);

        // Bei primitivem Typ erzeugt Parameterübergabe eine Kopie (nur der Wert wird übergeben)
        int changer = 4;
        changePrimitive(changer);
        System.out.println("Changer: " + changer);

        // Referenzdatentyp
        User user = new User(2, "Otto");
        changeUser(user);
        System.out.println("Changed user: with name " + user.username);

        // Bei String
        String str = "string";
        changeString(str);
        System.out.println(str);

    }

    public static void changeString(String string) {
        string = "anderer String";
    }

    public static void changeUser(User userToBeChanged) {

        // verändere Inhalt von User-Objekt
        userToBeChanged.username = "Franz";

        // verändere Referenz auf User -> zeigt jetzt auf ein neues Objekt
        userToBeChanged = new User(5,"Karl");
    }

    // Methoden-Signatur beschreibt die Methode mit Input-Parameter-Typen, Output-Typ, Sichtbarkeit usw.
    public static int sum(double op1, double op2) {
        return (int)(op1 + op2);
    }

    public static void changePrimitive(int toBeChanged) {
        toBeChanged = 2;
    }
}
