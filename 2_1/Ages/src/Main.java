public class Main {
    public static void main(String[] args) {
        int vasyaAge = 30;
        int katyaAge = 28;
        int mishaAge = 21;

        int min = vasyaAge;
        int middle = katyaAge;
        int max = mishaAge;

        if(min < middle && min < max){
            if (middle < max){
                System.out.println(min);
                System.out.println(middle);
                System.out.println(max);
            }
            if (middle > max){
                System.out.println(min);
                System.out.println(max);
                System.out.println(middle);
            }
        }

        if(middle < min && middle < max){
            if (min < max){
                System.out.println(middle);
                System.out.println(min);
                System.out.println(max);
            }
            if (min > max){
                System.out.println(middle);
                System.out.println(max);
                System.out.println(min);
            }
        }

        if(max < middle && max < min){
            if (middle < min){
                System.out.println(max);
                System.out.println(middle);
                System.out.println(min);
            }
            if (middle > min){
                System.out.println(max);
                System.out.println(min);
                System.out.println(middle);
            }
        }

    }
}
