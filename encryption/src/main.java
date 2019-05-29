import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        String alphabetSTR = "abcdefghijklmnopqrstuvwxyz", //regular alphabet
                revAlphaSTR = reverse(alphabetSTR), //alphabet in reverse
                              word; //user types in later.
        int alphaSize = alphabetSTR.length();
        Scanner key = new Scanner(System.in);
        int[] secret = new int[alphaSize];
        char[] alphaC, revAlphaC;
        alphaC = strToChar(alphabetSTR);
        revAlphaC = strToChar(revAlphaSTR);

        System.out.println("Type in a word to encrypt");
        word = key.nextLine();

        String eWord = encrypt(word.toLowerCase(), alphaC, revAlphaC);
        String dWord = decrypt(eWord, alphaC, revAlphaC);
        System.out.println(eWord);
        System.out.println(dWord);
    }

    //turns Strings to char array.  Useful for the alphabet
    public static char[] strToChar(String word){
        char[] strChar = word.toCharArray();
        return strChar;
    }

    public static String reverse(String word) {
        if ((word == null) || (word.length() <= 1)) {
            return word;
        }
        return reverse(word.substring(1)) + word.charAt(0);
    }

    public static String encrypt(String word, char[] alpha, char[] revAlpha){
        char[] splitWord = strToChar(word);
        for(int i = 0; i < splitWord.length; i++){
            for(int j = 0; j < revAlpha.length; j++){
                if(splitWord[i] == alpha[j]){
                    splitWord[i] = revAlpha[j];
                    break;
                }
            }
        }
        String encrypredWord = new String(splitWord);
        return encrypredWord;
    }
    public static String decrypt(String word, char[] alpha, char[] revAlpha){
        char[] splitWord = strToChar(word);

        for(int i = 0; i < splitWord.length; i++){
            for(int j = 0; j < revAlpha.length; j++){
                if(splitWord[i] == revAlpha[j]){
                    splitWord[i] = alpha[j];
                    break;
                }
            }
        }
        String decryptedWord = new String(splitWord);
        return decryptedWord;
    }
}
