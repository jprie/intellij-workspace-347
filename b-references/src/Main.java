import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Referenzen vom Typ String
        // 1) Referenz erstellen
        String str = null;
        System.out.println(str);

        // 2) Referenz erstellen die auf ein Objekt zeigt
        String str2 = "Hello";
        System.out.println(str2);

        // 3) Referenz erstellen die auf das vorige Objekt zeigt.
        String str3 = str2;
        System.out.println(str3);

        // primitive Datentypen kopieren
        int i = 5;
        int i2 = i;

        System.out.println("i=" + i + " i2=" + i2);

        // normale Referenzdatentypen kopieren
        User user = new User(1, "jprie");
        User user2 = user;
        // user und user2 zeigen auf das SELBE Objekt

        // wenn ich user.id verändere, ändert sich user2.id?
        user.id = 5;
        System.out.println("User2 id: " + user2.id);

        user.username = "hugo";
        System.out.println("User2 username: " + user2.username);

        // Objekt mit no-args erzeugen
        User noArgsUser = new User();
        // was steht in den Attributen?
        System.out.println(noArgsUser.id + " : " + noArgsUser.username);

        // noArgsUser Attribute  verändern
        noArgsUser.id = 7;
        noArgsUser.username = "noArgsUser";

        // verwende no args Konstruktor mit scanner "Login"

//        User loginUser = new User();
//
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Bitte geben Sie id und username ein");
//
//        loginUser.id = scanner.nextInt();
//        loginUser.username = scanner.next();
//
//        System.out.println("Sie wurden als: " + loginUser.username + " mit ID: " + loginUser.id + " eingeloggt");

        // TODO: Strings sind "konstant"!!
        // - keine primitiven Datentypen, sondern Referenzdatentypen
        // - Zeichenkette
        // - Ein Array von Characters

        String hello = "Hello";
        String hello2 = hello;
        System.out.println(hello2);

        hello = "anderes hello";
        System.out.println(hello2);

        // Objekt ohne Referenz (hat Seltenheits-Wert)
        new User(); // da keine Referenz, später nicht mehr referenzierbar

        // Vergleiche

        int k = 2;
        if (k == 2) {
            System.out.println("Richtig geraten");
        }

        // Das Ergebnis eines Vergleichs ist ein boolscher Wert
        boolean b = k==2;

        // Referenztypen vergleichen
        String foo = "foo";
        String foo2 = foo;

        // Referenzvergleich
        if (foo == foo2) {
            System.out.println("Beide Referenzen zeigen auf das SELBE Objekt");
        } else {
            System.out.println("Die Referenzen zeigen auf unterschiedliche Objekte");
        }

        // Inhalt von Objekten vergleichen
        String bar = "foo";
        if (foo.equals(bar)) {
            System.out.println("Foo equals bar");
        } else {
            System.out.println("Foo not equal bar");
        }


    }
}
