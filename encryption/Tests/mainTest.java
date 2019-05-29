import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class mainTest {

    @Test
    void encryptPass() throws Exception {
        main main = new main();
        String alphabetSTR = "abcdefjhijklmnopqrstuvwxyz", //regular alphabet
                revAlphaSTR = main.reverse(alphabetSTR);
        String word = "aaazzz";

        assertEquals(main.encrypt("zzzaaa", main.strToChar(alphabetSTR), main.strToChar(revAlphaSTR)), word); //true
    }

    @Test
    void encryptFail() throws Exception {
        main main = new main();
        String alphabetSTR = "abcdefjhijklmnopqrstuvwxyz", //regular alphabet
                revAlphaSTR = main.reverse(alphabetSTR);
        String word = "zzzaaa";

        assertEquals(main.encrypt("zzzaaa", main.strToChar(alphabetSTR), main.strToChar(revAlphaSTR)), word); //true
    }

//    @Test
//    void decrypt() throws Exception{
//        main main = new main();
//        String alphabetSTR = "abcdefjhijklmnopqrstuvwxyz", //regular alphabet
//                revAlphaSTR = main.reverse(alphabetSTR);
//        String word = "zzzaaa";
//
//        assertEquals(main.encrypt("aaazzz", main.strToChar(alphabetSTR), main.strToChar(revAlphaSTR)), word); //true
//
//    }
}