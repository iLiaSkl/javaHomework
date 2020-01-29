import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.text.ParseException;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException, ParseException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        CommandLine commandLine = new CommandLine();
        PhoneBook phoneBook = new PhoneBook();

        commandLine.printListOfCommands();

        while (true) {
            Command command = commandLine.getCommand(reader);

            switch (command.getType()) {
                case EXIT:

                    return;

                case LIST:

                    System.out.println(phoneBook);

                    break;

                case PHONE:


                    PhoneBook.Entry byPhoneNumEntry = phoneBook.findByPhoneNum(
                            PhoneNumUtils.format(command.getText()));

                    List <Map.Entry<String, String>> results = phoneBook.find(PhoneNumUtils.format(command.getText()));

                    if (byPhoneNumEntry.getName() != null) {
                        Object[] array =  results.toArray();
                        for (Object o : array) {

                            String num1 = String.valueOf(o);
                            System.out.println(num1);
                        }


                    } else {


                        byPhoneNumEntry.setName(commandLine.getName(reader));
                        String result = phoneBook.addContact(byPhoneNumEntry);
                        System.out.println(result);

                    }


                    break;

                case NAME:

                    PhoneBook.Entry byNameEntry = phoneBook.findByName(
                            command.getText()
                    );

                    if (byNameEntry.getPhoneNum() != null) {

                        System.out.println(byNameEntry);

                    } else {

                        byNameEntry.setPhoneNum(commandLine.getPhoneNum(reader));
                        String result = phoneBook.addContact(byNameEntry);
                        System.out.println(result);

                    }

                    break;
            }






        }
    }

}