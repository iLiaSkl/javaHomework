
import java.util.Arrays;
import java.util.stream.Collectors;


public class Main {
    public static void main(String[] args) {
       Float[] temperatures = new Float[30];
       for (int i = 0; i < temperatures.length; i++)
       {
           temperatures[i] = ((float)  ( Math.random() * 8) - 7 + 39);
           System.out.print((temperatures[i]) + "\t");
       }
       System.out.println("");
       long numberOfHealthPeople = Arrays.stream(temperatures).filter(i -> i >= 36.2 && i <= 36.9).count();
       System.out.println(numberOfHealthPeople);

       Double average = Arrays.stream(temperatures).collect(Collectors.averagingDouble(value -> value));

       System.out.printf("Average temperature: %3.1f", average);
    }
}


