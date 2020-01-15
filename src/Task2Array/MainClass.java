package Task2Array;

import java.util.Arrays;

public class MainClass {
    public static void main(String[] args) {
        FunctionsOfArray ob = new FunctionsOfArray();
        ob.Arraycreate(5);
        ob.ArrayInsert(3);
        ob.ArrayInsert(4);
        ob.ArrayInsert(1);
        ob.ArrayDelete(6);
        System.out.println(ob.ArraySearch(3));
        int[] arr = ob.ArraySort();
        System.out.println(Arrays.toString(arr));
    }
}
