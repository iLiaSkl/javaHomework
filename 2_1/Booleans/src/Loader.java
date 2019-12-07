
public class Loader
{
    public static void main(String[] args)
    {
        Integer milkAmount = 1200; // ml
        Integer powderAmount = 400; // g
        Integer eggsCount = 4; // items
        Integer sugarAmount = 15; // g
        Integer oilAmount = 30; // ml
        Integer appleCount = 38;
        String text;

        //powder - 400 g, sugar - 10 g, milk - 1 l, oil - 30 ml
        String pancakes = powderAmount >= 400 && sugarAmount >= 10 && milkAmount >= 1000 && oilAmount >= 30 ? "You could make a Pancakes"
        : "U dont have enough for pancakes";
        System.out.println(pancakes);



        //milk - 300 ml, powder - 5 g, eggs - 5
        String omelette = milkAmount >= 300 && powderAmount >= 5 && eggsCount >= 5 ? "You could make an Omelette"
                : "U dont have enough for omelette";

        System.out.println(omelette);


        //apples - 3, milk - 100 ml, powder - 300 g, eggs - 4
        String apple = appleCount >= 3 && milkAmount >= 100 && powderAmount >= 300 && eggsCount >= 4 ? "You could make an Apple pie"
        : "U dont have enough for apple pie";
        System.out.println(apple);


    }
}