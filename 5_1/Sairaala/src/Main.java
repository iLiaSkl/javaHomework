
import java.util.Arrays;
import java.util.stream.DoubleStream;



public class Main {
    private static final int TEMP_MAX = 40;
    private static final int TEMP_MIN = 32;
    private static final int PATIENTS = 30;
    private static final double HEALTHY_MIN = 36.2;
    private static final double HEALTHY_MAX = 36.9;

    public static void main(String[] args) {

        double[] temperatures = DoubleStream.generate(() ->
                Math.random() * (TEMP_MAX - TEMP_MIN) + TEMP_MIN).limit(PATIENTS).toArray();
        long numberOfHealthPeople = Arrays.stream(temperatures).filter(i -> i >= HEALTHY_MIN && i <= HEALTHY_MAX).count();
        System.out.println(numberOfHealthPeople);

        Double average = Arrays.stream(temperatures)
                .average()
                .orElse(0);

        System.out.printf("Average temperature: %3.1f", average);
    }
}


