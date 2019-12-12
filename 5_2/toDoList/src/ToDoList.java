import java.util.LinkedList;
import java.util.List;

public class ToDoList {

    public static LinkedList<String> todo = new LinkedList<>();

    public ToDoList(){
        todo.add("tododo");
        todo.add("nothing");
    }

    public static List<String> list() {
        return todo;
    }

    public static void add(String task, int pos){
        if(pos >= todo.size()){
            todo.add(task);
        } else if (pos <= 0){
            todo.addFirst(task);
        } else {
            todo.add(pos, task);
        }
    }

    public static void addLast(String task){
        todo.add(task);
    }

    public static void edit(String task, int pos) {
        if ( pos >= 0 && pos < todo.size()){
            todo.set(pos, task);
        } else {
            add(task, pos);
        }
    }
    public static void delete(int pos){
        if (pos >= 0 && pos < todo.size()){
            todo.remove(pos);
        }
    }
}
