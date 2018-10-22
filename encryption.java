import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class encryption {

    // Complete the caesarCipher function below.
    static String caesarCipher(String s, int input) {
        int extra = input % 26;
        System.out.printf("extra is " + extra + "\n");

        String result = "";
        // int ascii = 0;
        int addfactor = 0;
        int output = 0; // ascii value to be return.
        for (int i = 0; i < s.length(); i++) {
            int ascii = (int) s.charAt(i);

            if (ascii <= 90 && ascii >= 65) { // A=65
                // addfactor = (90 ) + extra;
                output = (ascii + extra) % 91;
                if (output == 0) {
                    output = 65;
                }
                result += Character.toString((char) output);
                System.out.printf(s.charAt(i) + " => " + Character.toString((char) output) + " ");
                System.out.printf("output is " + output + "\n");

            }

            else if (ascii <= 122 && ascii >= 97) { // A=65
                // addfactor = 122 - ascii + extra;
                output = (ascii + extra) % 123;
                if (output == 0) {
                    output = 97;
                }

                result += Character.toString((char) output);
                System.out.printf(s.charAt(i) + " => " + Character.toString((char) output) + " ");
                System.out.printf("output is " + output + "\n");

            } else {
                char c = s.charAt(i);
                result += String.valueOf(c);

                System.out.println("else is called");
                System.out.printf(s.charAt(i) + " => pass as it is " + "\n");

            }

        }
        return result;

    }

    public static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String s = scanner.nextLine();

        int k = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String result = caesarCipher(s, k);

        System.out.printf(result + "\n");

        scanner.close();
    }
}
