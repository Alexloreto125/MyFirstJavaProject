import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Hello and welcome!");
        System.out.println("Perfetto");
        boolean x = true;
        x = false;
        /* NUMERI INTERI*/
        byte numeroPiccolo = 100;
        short numeroNonPiccolo = 1000;
        int numeroIntero = 50000;
        long numeroGrande = 1232132131;

        // Numero Decimali
        double numeroDecimale = 0.5;
        //float altronumerodDecimale= 0.5f;
        //Double e FLoat rappresentano numeri decimali come regola generale.
        //Consigliato usare i double

        System.out.println("numeroDecimale= " + numeroDecimale);
        numeroIntero = numeroPiccolo;
        System.out.println(numeroIntero);
//CASTING IMPLICITO
        numeroPiccolo = (byte) numeroGrande; //! ESEMPIO DI CASTING ( PUO' PORTARE POSSIBILI PERDITE DI DATI )
        System.out.println("NUMERO PICCOLO= " + numeroPiccolo);

        String stringa = "Hello World World World";
        char singoloCarattere = 'M';
//        stringa= String.valueOf(2);
        System.out.println(stringa);
        System.out.println("La lunghezza della stringa è: " + stringa.length());
        System.out.println("IL PRIMO CARATTERE è: " + stringa.charAt(0));
        System.out.println(stringa.replace("World", "Mondo"));

        String[] arrayOfStrings = {"Mario", "Franco", "Giancarlo"};

        for (int i = 0; i < arrayOfStrings.length; i++) {
            System.out.println("Elemento corrente: " + arrayOfStrings[i]);
            System.out.println("Indice Corrente: " + i);
        }

        int risultato = sum(2, 5);
        System.out.println("La somma è: " + risultato);
        printSum(2, 7);
        String risultatoStringa = sumAsString(3, 7);
        System.out.println("LA SOMMA E: " + risultatoStringa);


        Scanner scanner = new Scanner(System.in);
        System.out.println("INSERISCI IL NOME");
        String name = scanner.nextLine();
        //? RICORDA DI SCRIVERE IN CONSOLE
        System.out.println("Hai inserito " + name
        );
        System.out.println("inserisci Primo numero");
        int numero = Integer.parseInt(scanner.nextLine());
        System.out.println("inserisci secondo numero");
        int numero2 = Integer.parseInt(scanner.nextLine());
        System.out.println("La somma è: " + sum(numero, numero2));

    }


    //! NON LO ACCETTA PERCHE' DEVE TORNARE UN INT
    public static int sum(int num1, int num2) {
        return num1 + num2;

    }


    //! QUESTO NON TORNA NIENTE E LO ACCETTA
    public static void printSum(int num1, int num2) {
        System.out.println("La somma è: " + (num1 + num2));
    }

    public static String sumAsString(int num1, int num2) {
        return "" + (num1 + num2);
    }
}
