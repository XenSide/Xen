package Xen;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author XenSide
 */
public class IO {

    public static InputStreamReader input = new InputStreamReader(System.in);
    public static BufferedReader tastiera = new BufferedReader(input);

    public static String askString(String s1) {
        Boolean isDone = null;
        String s = null;
        do {
            System.out.print(s1 + " ");
            try {
                s = tastiera.readLine();
                isDone = true;
            } catch (IOException e) {
                System.err.println("Errore nell'inserimento");
                isDone = false;
            }
        } while (!isDone);
        return s;
    }

    public static int askInt(String s) {

        int i = 0;
        Boolean isDone = null;
        do {
            try {
                System.out.print(s + " ");
                i = Integer.valueOf(tastiera.readLine());
                isDone = true;
            } catch (IOException | NumberFormatException e) {
                System.err.println("Errore nell'inserimento");
                isDone = false;
            }
        } while (!isDone);
        return i;
    }

    public static char askChar(String s) {
        Boolean isDone = null;
        Character c = null;
        do {
            try {
                System.out.print(s);
                c = tastiera.readLine().charAt(0);
                isDone = true;
            } catch (IOException e) {
                System.err.println("Errore nell'inserimento");
                isDone = false;
            }
        } while (!isDone);
        return c;
    }

    public static double askDouble(String s) {
        Boolean isDone = null;
        Double d = null;
        do {
            try {
                System.out.print(s);
                d = Double.valueOf(tastiera.readLine());
                isDone = true;
            } catch (IOException | NumberFormatException e) {
                System.err.println("Errore nell'inserimento!");
                isDone = false;
            }
        } while (!isDone);
        return d;
    }

    public static float askFloat(String s) {

        Boolean isDone = null;
        Float f = null;
        do {
            try {
                System.out.print(s);
                f = Float.valueOf(tastiera.readLine());
                isDone = true;
            } catch (IOException | NumberFormatException e) {
                System.err.println("Errore nell'inserimento");
                isDone = false;
            }
        } while (!isDone);
        return f;
    }

    public static Boolean askBoolean(String s) {
        Boolean isDone = null, d = null;
        char temp;
        do {
            try {
                System.out.println(s + "\nValori accettati: 1.Vero (V/T) 2.Falso(F)");
                temp = tastiera.readLine().toLowerCase().charAt(0);
                switch (temp) {
                    case '1':
                    case 'v':
                    case 't':
                        d = true;
                        isDone = true;
                        break;
                    case'2':
                    case 'f':
                        d = false;
                        isDone = true;
                        break;
                    default:
                        throw new Exception();

                }
            } catch (Exception e) {
                System.err.print("Errore nell'inserimento!");
                isDone = false;
            }
        } while (!isDone);
        return d;
    }
}
