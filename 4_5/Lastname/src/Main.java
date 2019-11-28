import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String strFIO = reader.readLine();


        boolean match = strFIO.matches("[\\s +а-яёА-ЯЁ]+" + "\\s[а-яёА-ЯЁ]+" + "\\s[а-яёА-ЯЁ]+");

        if (match) {
            String[] arrayFIO = strFIO.split("\\s");

            System.out.println("Фамилия: " + arrayFIO[0]);
            System.out.println("Имя: " + arrayFIO[1]);
            System.out.println("Отчество: " + arrayFIO[2]);


        }else {
            System.out.println("Переключите раскладку на русскую");
        }
    }
}

