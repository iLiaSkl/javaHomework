import java.util.HashSet;
import java.util.Set;

 class EmailList {

    public static Set<String> emails = new HashSet<>();
    public void add(String email) {
        if (check(email)) {
            emails.add(email);
        }else {
            printWarning();
        }
    }

    public void list() {

        if (emails.isEmpty()) {
            System.out.println("Пусто");
        }
        for (String em : emails) {
            System.out.println(em);
        }
    }

    public static void printWarning() {
        System.out.println("Попробуйте еще раз");
    }

    public static boolean check(String email) {
        return email.toUpperCase().matches("^[a-zA-Z0-9_!#$%&’*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$");
    }
}