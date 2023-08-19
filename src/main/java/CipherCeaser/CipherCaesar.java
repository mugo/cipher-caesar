package CipherCeaser;

import java.util.Scanner;

public class CipherCaesar {
    // This rotates a character k-positions

    private String myPhrase;
    private int theOffset;

    public CipherCaesar(String myPhrase, int theOffset) {
        this.myPhrase = myPhrase;
        this.theOffset = theOffset;
    }

    public String getText() {
        return myPhrase;
    }

    public int getShift() {
        return theOffset;
    }

    public static char cipher(char c, int k) {
        // Declare constants
        final int alphabetLetters = 26;
        final int cipherShift = k % alphabetLetters;
        final char asciiShift = Character.isUpperCase(c) ? 'A' : 'a';

        // we shift down to 0..25 for a..z
        char shifted = (char) (c - asciiShift);

        // Here we rotate the letter and handle "wrap-around" for negatives and value >= 26
        shifted = (char) ((shifted + cipherShift + alphabetLetters) % alphabetLetters);

        // Here we shift back up to english characters
        return (char) (shifted + asciiShift);
    }

    // Here we Rotate a string k-positions
    public  String cipher() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < myPhrase.length(); i++) {
            if(myPhrase.charAt(i) == ' ')
            {
                sb.append(" ");
            }
            else
            {
                sb.append(cipher(myPhrase.charAt(i), theOffset));
            }

        }
        return sb.toString();
    }
}