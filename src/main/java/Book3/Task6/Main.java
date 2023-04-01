package Book3.Task6;

import java.text.NumberFormat;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Locale locale = new Locale("kz", "KZ");
        NumberFormat nfGe = NumberFormat.getInstance(locale);
    }

}
