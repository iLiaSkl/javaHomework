import java.util.Arrays;
import java.util.Collection;


public class Main {
    public static void main(String[] args) {
        String[] colors = {
                "красный",
                "оранжевый",
                "желтый",
                "зелёный",
                "голубой",
                "синий",
                "фиолетовый"
        };

        String[] invertedRainbow = new String[colors.length];

        for (int i = 0; i < colors.length; i++) {
            invertedRainbow[colors.length - i - 1] = colors[i];
        }

        printRainbow(Arrays.asList(invertedRainbow));


    }

    private static void printRainbow(Collection array) {
        for (Object string: array) {
            System.out.println("\t" + string);
        }
    }
}


