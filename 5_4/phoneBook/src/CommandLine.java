import java.io.BufferedReader;
import java.io.IOException;
import java.text.ParseException;

public class CommandLine {
    void printListOfCommands(){
        System.out.println("Введите exit, чтобы закрыть программу");
        System.out.println("Commands: \n" +
                "LIST, \n" +
                "<phone number> \n" +
                "<name> \n");
    }

    Command getCommand(BufferedReader reader) throws IOException{
        System.out.println(">>> ");
        String commandLine = reader.readLine().trim();

        Command.CommandType type;

        if(commandLine.equalsIgnoreCase("exit")){
            type = Command.CommandType.EXIT;
        } else if (commandLine.equalsIgnoreCase("list")){
            type = Command.CommandType.LIST;
        } else if (PhoneNumUtils.isPhoneNumber(commandLine)){
            type = Command.CommandType.PHONE;
        } else {
            type = Command.CommandType.NAME;
        }
        return new Command(type, commandLine);
    }

    String getPhoneNum (BufferedReader reader) throws IOException, ParseException{
        String phoneStr;

        do {
            System.out.println("Введите номер: ");
            phoneStr = reader.readLine();
        } while (!PhoneNumUtils.isPhoneNumber(phoneStr));

        return  PhoneNumUtils.format(phoneStr);
    }
    String getName(BufferedReader reader) throws IOException{
        System.out.println("Введите имя: ");
        return reader.readLine();
    }
}
