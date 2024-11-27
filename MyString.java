public class MyString {
    public static void main(String[] args) {
        System.out.println("Testing lowercase:");
        System.out.println("UnHappy : " + lowerCase("UnHappy"));
        System.out.println("This costs 15 Sheksls : " + lowerCase("This costs 15 Sheksls"));
        System.out.println("TLV : " + lowerCase("TLV"));
        System.out.println("lowercase : " + lowerCase("lowercase"));

        System.out.println("Testing contains:");
        System.out.println(contains("unhappy", "happy")); // true
        System.out.println(contains("happy", "unhappy")); // false
        System.out.println(contains("historical", "story")); // false
        System.out.println(contains("psychology", "psycho")); // true
        System.out.println(contains("personality", "son")); // true
        System.out.println(contains("personality", "dad")); // false
        System.out.println(contains("resignation", "sign")); // true
    }

    /** Returns the lowercase version of the given string. */
    public static String lowerCase(String str) {
        String lowerCaseStr = "";
        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            int numToAdd = 0;
            if (currentChar > 64 && currentChar < 91) {
                numToAdd = 32;
            }
            lowerCaseStr += (char) (currentChar + numToAdd);
        }
        return lowerCaseStr;
    }

    /** If str1 contains str2, returns true; otherwise returns false. */
    public static boolean contains(String str1, String str2) {
        if (str2.length() == 0)
            return true;
        for (int i = 0; i < str1.length(); i++) {
            for (int j = 0; j < str2.length(); j++) {
                if ((int) str1.charAt(i + j) != (int) str2.charAt(j)) {
                    break;
                }
                if (j == str2.length() - 1) {
                    return true;
                }
            }
        }
        return false;
    }

    // /** If str1 contains str2, returns true; otherwise returns false. */
    // public static boolean contains(String str1, String str2) {
    // int counter = 0;
    // for (int i = 0; i < str1.length(); i++) {
    // if (counter + 1 == str2.length()) {
    // return true;
    // }
    // if (i == str2.length()) {
    // return str2.length() == counter + 1;
    // }
    // if ((int) str1.charAt(i) == (int) str2.charAt(counter)) {
    // counter++;
    // } else {
    // counter = 1;
    // }
    // }
    // return str2.length() == counter + 1;
    // }
}
