import java.util.ArrayList;
import java.util.Arrays;

public class ArrayUtil {
    public static Integer[] reverse(Integer arr[]) {
        int j = arr.length;
        Integer[] rev = new Integer[j];
        for (Integer i = 0; i < j; i++) {
            rev[j - 1 - i] = arr[i];
        }
        return rev;
    }

    public static Integer sum(Integer arr[]) {
        Integer sum = 0;
        for (Integer i : arr) {
            sum += i;
        }
        return sum;
    }

    public static Double average(Double arr[]) {
        Double sum = 0d;
        for (Integer i = arr.length - 1; i > -1; i--) {
            sum += arr[i];
        }
        if (arr.length == 0) {
            System.out.print("\nthe average can not found, 0 is default value");
            return 0d;
        } else return sum / arr.length;
    }

    public static Integer max(Integer arr[]) {
        if (arr.length != 0) {
            Integer max = arr[0];
            for (Integer i : arr) {
                if (max < i) max = i;
            }
            return max;
        } else {
            System.out.print("\nthe max can not found, 0 is default value");
            return 0;
        }
    }

    public static Integer[] copyArray(Integer arr[]) {
        Integer copy[] = new Integer[arr.length];
        System.arraycopy(arr, 0, copy, 0, arr.length);
        return copy;
    }

    public static <T> void printArray(T arr) {

        if (arr instanceof Object[]) {
            System.out.print("[");
            for (T element : (T[]) arr) System.out.print(element + " ");
            System.out.print("]");
        } else if (arr instanceof ArrayList) {
            System.out.print("[");
            for (Object element : (ArrayList<?>) arr) {
                System.out.print(element + " ");
            }
            System.out.print("]");

        }
    }
}

//        System.out.print("[");
//        for(T element : arr){
//            System.out.print(element+"\t");
//        }
//        System.out.print("]");

