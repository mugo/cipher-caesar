package CipherCeaser;
import org.junit.*;
import static org.junit.Assert.*;

public class CipherCaesarTest{
    @Test
    public void rotateCharacter_ShiftsCharacterCorrectNumberofTimesAtEndOfAlphabet_char(){
        char input='x';
        char expectedOutput='h';
        assertEquals(expectedOutput, CipherCaesar.cipher(input, 10));
    }

    @Test
    public void rotateCharacter_ShiftsCharacterCorrectNumberofTimes_char(){
        char input='b';
        char expectedOutput='i';

        assertEquals(expectedOutput, CipherCaesar.cipher(input, 7));
    }




}