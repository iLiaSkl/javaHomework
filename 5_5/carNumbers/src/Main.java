import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Формирование списка ... ");
        List<String> list = genAutoNumbers();
        System.out.println("Список сформирован");

        TreeSet<String> treeSet = new TreeSet<>(list);
        HashSet<String> hashSet = new HashSet<>(list);

        System.out.println("Количество: " + treeSet.size());

        String stringToFind = list.get(655);
        System.out.println("Найти элемент" + stringToFind);

        long start = System.nanoTime();
        boolean fromArray = list.contains(stringToFind);
        long end = System.nanoTime();
        System.out.println("Времени потрачено " + (end - start) + " ns.");


        start = System.nanoTime();
        boolean byBinarySearch = Collections.binarySearch(list, stringToFind) >= 0;
        end = System.nanoTime();
        System.out.println("Времени потрачено " + (end - start) + " ns.");


        start = System.nanoTime();
        boolean fromTreeSet = treeSet.contains(stringToFind);
        end = System.nanoTime();
        System.out.println("Времени потрачено " + (end - start) + " ns.");

        start = System.nanoTime();
        boolean fromHashSet = hashSet.contains(stringToFind);
        end = System.nanoTime();
        System.out.println("Времени потрачено " + (end - start) + " ns.");

    }

    private  static List<String> genAutoNumbers(){
        List<String> list = new ArrayList<>(5000000);

        for (char ch = 'A'; ch <= 'Z'; ch++){
            System.out.println(ch + "\t...");

            for (int i = 0; i < 1000; i++){
                String numPart = ch + intToString(i) + ch + ch;
                appendAllRegions(numPart, list);
            }
        }
        return list;
    }

    private static void appendAllRegions(String autoNum, List<String> list){
        autoNum = autoNum.concat(" ");

        for(int i = 1; i < 179; i++){
            list.add(autoNum + intToString(i));
        }
    }

    private static String intToString(int i){
        return String.format("%03d", i);
    }
}

