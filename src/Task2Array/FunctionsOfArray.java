package Task2Array;

public class FunctionsOfArray {
    int count = 0;
    private int[] array;

    public void Arraycreate(int size) {
        array = new int[size];

    }

    public void ArrayInsert(int item) {
        if (count == array.length)
            System.out.println("Array Full not inserted");
        else {
            array[count++] = item;
        }
    }

    public void ArrayDelete(int element) {
        for (int i = 0; i < count; i++) {
            if (element == array[i]) {
                array[i] = array[i + 1];
            } else
                System.out.println("Item not found");


        }
    }

    public boolean ArraySearch(int item) {
        boolean response = false;
        for (int i = 0; i < array.length; i++) {
            if (item == array[i]) {
                response = true;
                break;
            }
        }
        return response;

    }

    public int[] ArraySort() {
        int s;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j + 1] < array[j]) {
                    s = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = s;
                }


            }
        }
        return array;
    }
}
