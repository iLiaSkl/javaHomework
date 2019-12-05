
public class Loader
{
    public static void main(String[] args)
    {
        Integer milkAmount = 200; // ml
        Integer powderAmount = 300; // g
        Integer eggsCount = 4; // items
        Integer sugarAmount = 5; // g
        Integer oilAmount = 30; // ml
        Integer appleCount = 8;

        //powder - 400 g, sugar - 10 g, milk - 1 l, oil - 30 ml
        if (powderAmount >= 400 && sugarAmount >= 10 && milkAmount >= 1000 && oilAmount >= 30)
        {
            System.out.println("You could make a Pancakes");
        } else
        {
            System.out.println("U dont have enough for pancakes");
        }


        //milk - 300 ml, powder - 5 g, eggs - 5
        if (milkAmount >= 300 && powderAmount >= 5 && eggsCount >= 5)
        {
            System.out.println("You could make an Omelette");
        } else
        {
            System.out.println("U dont have enough for omelette");
        }


        //apples - 3, milk - 100 ml, powder - 300 g, eggs - 4
        if (appleCount >= 3 && milkAmount >= 100 && powderAmount >= 300 && eggsCount >= 4)
        {
            System.out.println("You could make an Apple pie");
        } else
        {
            System.out.println("U dont have enough for apple pie");
        }

    }
}