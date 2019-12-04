import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ToDoList toDoList = new ToDoList();

        System.out.println("Введите exit, чтобы закрыть программу");
        System.out.println("Commands: \n" +
                "LIST,\n" +
                "ADD <position> <task>, \n" +
                "EDIT <position> <task>, \n" +
                "DELETE <position> \n");

        while (true){
            System.out.println(">>> ");
            String commandLine = reader.readLine().trim();

            if(commandLine.equalsIgnoreCase("exit"))
            {
                return;
            }

            String[] command = commandLine.split(" ");

            switch (command[0].toUpperCase())
            {
                case "ADD":
                    if(command.length == 3){
                        try {
                            int position = Integer.parseInt(command[1]) - 1;
                            toDoList.add(command[2], position);
                        }catch (Exception e){
                            printWarning();
                        }
                    }else {
                        printWarning();
                    }
                    break;
                case "DELETE":
                    if(command.length == 2){
                        try {
                            int position = Integer.parseInt(command[1]) - 1;
                            toDoList.delete(position);
                        }catch (Exception e){
                            printWarning();
                        }
                    }else {
                        printWarning();
                    }
                    break;
                case "LIST":
                    List<String> todo = toDoList.list();

                    if (todo.isEmpty()){
                        System.out.println("Нечего делать\n");
                        break;
                    }

                    int i = 0;
                    for (String task : todo){
                        System.out.println("\t" + i + "\t" + task);
                        i++;
                    }
                    break;
                case"EDIT":
                    if (command.length == 3){
                        try {
                            int position = Integer.parseInt(command[1]) - 1;
                            toDoList.edit(command[2], position);
                        }catch (Exception e){
                            printWarning();
                        }
                    }else {
                        printWarning();
                    }
                    break;
                default:
                    printWarning();


            }
        }
    }
    private static void printWarning(){
        System.out.println("Неизвестная команда");
    }
}
