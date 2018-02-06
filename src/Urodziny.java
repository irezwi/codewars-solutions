import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

import static java.lang.Math.pow;

public class Urodziny {

    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
        int counter = 0;
        int omega = 0;
        int sprzyjajace = 0;
        PrintWriter writer = new PrintWriter("data.txt", "UTF-8");
        PrintWriter result = new PrintWriter("result.txt", "UTF-8");

        for (int m = 0; m < 7; m++) {
            for (int n = 0; n < 7; n++) {
                for (int o = 0; o < 7; o++) {
                    //System.out.println(dzien(b) + dzien(c) + dzien(d) + dzien(e) + dzien(f) + dzien(g) + dzien(h) + dzien(i) + dzien(j) + dzien(k) + dzien(l) + dzien(m) + dzien(n) + dzien(o));
                    int num[] = {m + 1, n + 1, o + 1};
                    System.out.println(Arrays.toString(num));
                    for (int aNum : num) {
                        if (aNum == 2) {
                            counter++;
                        }
                    }
                    if (counter <= 2) {
                        sprzyjajace++;
                        counter = 0;
                    } else {
                        counter = 0;
                    }
                    omega++;
                }
            }
        }

        writer.close();
        result.println(omega);
        result.println(sprzyjajace);
        System.out.println(sprzyjajace);
        System.out.println(omega);
        double probability = (sprzyjajace / omega);
        System.out.println(probability);
    }

    public static String dzien(int i) {
        switch (i) {
            case 0:
                return "Po ";
            case 1:
                return "Wt ";
            case 2:
                return "Sr ";
            case 3:
                return "Cz ";
            case 4:
                return "Pt ";
            case 5:
                return "So ";
            case 6:
                return "Nd ";
            default:
                return null;
        }
    }
}
