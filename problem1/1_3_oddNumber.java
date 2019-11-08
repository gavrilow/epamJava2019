/*3. OddNumber.
* В одномерном массиве целых чисел найти наибольшее нечетное число.
*/

public class OddNumber {
    public static void main(String args[]) {
        int[] array = new int[]{33, 35, 100020, -1, 787, 999};
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max & array[i] % 2 != 0) {
                max = array[i];
            }
        }
        System.out.println("Max Odd Number in Array is: " + max);
    }
}
