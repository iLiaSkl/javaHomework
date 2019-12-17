
import java.io.IOException;


public class Main extends EmailList{

    private final static String COMMAND_ADD = "ADD";
    private final static String COMMAND_LIST = "LIST";
    private final static String COMMAND_EXIT = "EXIT";

    public static void main(String[] args) throws IOException {


        System.out.println("Введите EXIT, чтобы выйти из программы");
        System.out.println("Commands: \n" +
                "LIST, \n" +
                "ADD <email> \n");

        EmailList emailList = new EmailList();
        for (;;) {
                System.out.println(">>> ");
                String userInput = UserInput.getLine();
                if (userInput.startsWith(COMMAND_ADD)) {
                    emailList.add(userInput.replaceFirst(COMMAND_ADD, "").trim());
                } else if (userInput.equals(COMMAND_LIST)) {
                    emailList.list();
                } else if (userInput.equals(COMMAND_EXIT)) {
                    break;
                } else {
                    System.out.println("неверная команда");
                }
            }



        }
    }


