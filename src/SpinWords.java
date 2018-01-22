public class SpinWords {

    public String spinWords(String sentence) {
        String[] arr = sentence.split(" ");
        String result = "";
        for (String s : arr) {
            if(s.length() >= 5) {
                s = new StringBuilder(s).reverse().toString();
            }
            result = result + s + " ";
        }
        return result.substring(0, result.length()-1);
    }
}