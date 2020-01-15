package Task1Array;

import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        int[] array = new int[10];
        System.out.println(array);
        // static insertion
        array[0] = 1;
        array[1] = 2;
        array[2] = 3;
        array[3] = 4;
        for (int i = 0; i < array.length; i++) {

            System.out.println(array[i]);
        }
        //insertion from command line
        for (int i = 0; i < args.length; i++) {
            array[i] = Integer.parseInt(args[i]);
            System.out.println(array[i]);
        }
        // insertion using scanner class
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            array[i] = sc.nextInt();
            System.out.println(array[i]);

        }
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        System.out.println("sum " + sum + "Avg " + ((double) sum / array.length));

    }
}
