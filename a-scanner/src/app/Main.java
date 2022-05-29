package app;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // .. your code

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a number, a float, a String and a line2.3");

        // akzeptiert nur Ganzzahlen
        int number = scanner.nextInt();

        // akzeptiert Ganzzahlen und Gleitkomma
        float f = scanner.nextFloat();

        // akzeptiert Zeichenketten aus Zahlen und Buchstaben
        String str = scanner.next();

        // Liest auch durch <Leerzeichen> getrennte Zeichenfolgen ein. LIEST BIST ZUM ENDE DER ZEILE \n
        // akzeptiert Zeichenketten aus Zahlen und Buchstaben mit Abständen!!
        String line = scanner.nextLine();

        System.out.println("Number entered: " + number);
        System.out.println("Float entered: " + f);
        System.out.println("String entered: " + str);
        System.out.println("Line entered: " + line);

        scanner.close(); // Sie können in diesem Programm keinen Scanner(System.in) mehr öffnen

        // DESWEGEN ERST AM ENDE SCHLIESSEN

        // Nach close einen neuen Scanner aufmachen

//        scanner = new Scanner(System.in);
//        scanner.next();

    }

}
