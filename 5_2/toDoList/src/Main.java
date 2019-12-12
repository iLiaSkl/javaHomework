import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

public class Main {


    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ToDoList toDoList = new ToDoList();

        System.out.println("Введите exit, чтобы закрыть программу");
        System.out.println("Commands: \n" +
                "LIST,\n" +
                "ADD, \n" +
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
                   add(command);
                    break;
                case "DELETE":
                    delete(command);
                    break;
                case "LIST":
                    list(command);
                    break;
                case"EDIT":
                    edit(command);
                    break;
                default:
                    printWarning();
            }
        }

    }
    private static void printWarning(){
        System.out.println("Неизвестная команда");
    }
    
    public static void add(String[] command){
        if (command.length == 2){
            try {
                ToDoList.addLast(command[1]);
            }
            catch (Exception e){
                printWarning();
            }

        }
        else if(command.length == 3){
            try {
                int position = Integer.parseInt(command[1]) - 1;
                ToDoList.add(command[2], position);


            }catch (Exception e){
                printWarning();
            }
        }else {
            printWarning();
        }
    }

    public static void delete(String[] command)
    {
        if(command.length == 2){
            try {
                int position = Integer.parseInt(command[1]) - 1;
                ToDoList.delete(position);
            }catch (Exception e){
                printWarning();
            }
        }else {
            printWarning();
        }
    }

    public static void list(String[] command){
        List<String> todo = ToDoList.list();

        if (todo.isEmpty()){
            System.out.println("Нечего делать\n");

        }

        int i = 0;
        for (String task : todo){
            System.out.println("\t" + i + "\t" + task);
            i++;
        }
    }

    public static void edit(String[] command)
    {
        if (command.length == 3){
            try {
                int position = Integer.parseInt(command[1]) - 1;
                ToDoList.edit(command[2], position);
            }catch (Exception e){
                printWarning();
            }
        }else {
            printWarning();
        }
    }


}
