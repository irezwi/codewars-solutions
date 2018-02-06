public class Kata {
    public static int TripleDouble(long num1, long num2) {
        boolean _triple = false;
        boolean _double = false;
        char letter1 = 'a', letter2 = 'z';

        String s1 = String.valueOf(num1);
        String s2 = String.valueOf(num2);
        for (int i = 0; i < s1.length() - 2; i++) {
            if (s1.charAt(i) == s1.charAt(i + 1) && s1.charAt(i) == s1.charAt(i + 2) && s1.charAt(i) != s1.charAt(i + 3)) {
                _triple = true;
                letter1 = s1.charAt(i);
            }
        }

        for (int i = 0; i < s2.length() - 1; i++) {
            if (s2.charAt(i) == s2.charAt(i + 1) && s2.charAt(i + 1) != s2.charAt(i + 2)) {
                _double = true;
                letter2 = s2.charAt(i);
            }
        }

        if (_triple && _double && letter1 == letter2)
            return 1;
        else return 0;
    }

    public static String autocorrect(String input) {
        String[] arr = input.split(" ");
        String result = "";
        for (String s : arr) {
            if (s.equals("u") || s.equals("you") || checkForYouuu(s))
                s = "your sister";
            result = result + s + " ";
        }
        return result.substring(0, result.length() - 1);
    }

    public static boolean checkForYouuu(String input) {
        int counter = 0;
        for (int i = 2; i < input.length() + 1; i++) {
            if (input.charAt(i) == 'u') {
                counter++;
            }
        }

        return counter == input.length() + 2 && (input.charAt(0) == 'y' || input.charAt(0) == 'Y') && input.charAt(1) == 'o';
    }
}