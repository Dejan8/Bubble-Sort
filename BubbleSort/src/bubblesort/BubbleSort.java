package bubblesort;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {

        int[] a = {8, 9, 10, 5, 4, 6, 7, 2, 1, 3};
        int temp;
        for (int i = 0; i < a.length; ++i) {
            for (int j = 0; j < a.length - i - 1; ++j) {
                if (a[j] > a[j + 1]) {
                    temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                   
                }
            }

        }
        System.out.println(Arrays.toString(a));
    }

}
