/** String processing exercise 1. */
public class LowerCase {
    public static void main(String[] args) {  
        String str = args[0];
        System.out.println(lowerCase(str));
    }

   /**
    * Returns a string which is identical to the original string, 
    * except that all the upper-case letters are converted to lower-case letters.
    * Non-letter characters are left as is.
    */
    public static String lowerCase(String s) {
        String newSen = "";
        for (int i = 0; i < s.length(); i++) {
            int ascii = (int) s.charAt(i);
            if (ascii >= 65 && ascii <= 90) {
                ascii = ascii + 32;
                char asciiToChar = (char) ascii;
                newSen = newSen + asciiToChar;
            } else {
                newSen = newSen + s.charAt(i);
            }
        }
        return newSen;
    }
}