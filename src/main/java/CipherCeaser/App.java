package CipherCeaser;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String passwd;
        int key;

        System.out.print("Enter a sentence: ");
        passwd = keyboard.nextLine();

        do {
            System.out.print("Enter a key between 1 and 25: ");
            key = keyboard.nextInt();

            // Manage the key errors
            if (key < 1 || key > 25) {
                System.out.printf("You have entered an invalid key; it need be between 1 and 25, you entered %d.\n", key);
            }
        } while (key < 1 || key > 25);

        System.out.println("passwd:\t" + passwd);
        CipherCaesar CipherCaesar = new CipherCaesar(passwd,key);
        String encryption = CipherCaesar.cipher();
        System.out.println("Encrypted:\t" + encryption);

        // Now decrypt
        CipherCaesar CipherCaesarDec = new CipherCaesar(encryption,-key);
        System.out.println("Decrypted:\t" + CipherCaesarDec.cipher());
    }
}
