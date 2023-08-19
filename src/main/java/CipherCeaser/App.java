package CipherCeaser;

import java.util.Scanner;

//import static CipherCaesar.CipherCaesar.cipher;

public class App {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String password;
        int key;

        System.out.print("Enter a sentence: ");
        password = keyboard.nextLine();

        do {
            System.out.print("Enter a key between 1 and 25: ");
            key = keyboard.nextInt();

            //here we handle key errors
            if (key < 1 || key > 25) {
                System.out.printf(" The key must be between 1 and 25, you entered %d.\n", key);
            }
        } while (key < 1 || key > 25);


        System.out.println("Password:\t" + password);
        CipherCaesar CipherCaesar = new CipherCaesar(password,key);
        String encryption = CipherCaesar.cipher();
        System.out.println("Encrypted:\t" + encryption);

        //decryption
        CipherCaesar CipherCaesarDec = new CipherCaesar(encryption,-key);
        System.out.println("Decrypted:\t" + CipherCaesarDec.cipher());

    }
}
