/* 4. IdenticalNumbers.
 * В двух одномерных массивах чисел найти такие числа, которые есть в обоих исходных массивах.
 */

public class IdenticalNumbers {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5, 6, 7, -777};
        int[] arr2 = {4, 5, 6, 7, 8, 9, 1, 777};
        System.out.print("Identical numbers are: ");
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    System.out.print(arr1[i] + " ");
                }
            }
        }
    }
}
