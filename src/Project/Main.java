package Project;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        int n = 100;
        Integer[] array = new Integer[100];
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }
        int evenSize = 0;
        for (int i = 0; i < n; i++) {
            if (array[i] % 2 == 0)
                evenSize++;
        }
        Integer[] even = new Integer[evenSize];
        int j = 0;
        for (int i = 0; i < n; i++) {
            if (array[i] % 2 == 0)
                even[j++] = array[i];
        }
        Set<Integer> targetSet = new HashSet(Arrays.asList(even));
        for (Integer s : targetSet) {
            System.out.println(s);
        }
    }
}
