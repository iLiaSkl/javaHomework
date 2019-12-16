import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Введите exit, чтобы выйти из программы");
        System.out.println("Commands: \n" +
                "LIST, \n" +
                "ADD <email> \n");

        Set<String> emails = new HashSet<>();
        while (true){
            System.out.println(">>> A");
            String commandLine = reader.readLine().trim();

            if(commandLine.equalsIgnoreCase("exit")){
                return;
            }

            String[] command = commandLine.split(" ");
            switch (command[0].toUpperCase()){
                case "ADD":
                    if(command.length == 2 && check(command[1])){
                        emails.add(command[1]);
                    } else{
                        printWarning();
                    }
                    break;

                case "LIST":
                    if(emails.isEmpty()){
                        System.out.println("Пусто");
                        break;
                    }
                    for (String em : emails){
                        System.out.println(em);
                    }
                    break;
                default:
                    printWarning();
            }

        }
    }

    private static void printWarning(){
        System.out.println("Попробуйте еще раз");
    }

    private static boolean check(String email){
        return email.toUpperCase().matches("^[a-zA-Z0-9_!#$%&’*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$");
    }
}
