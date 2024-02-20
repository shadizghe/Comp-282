import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrayListSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        System.out.println("Enter five numbers:");
        for (int i = 0; i < 5; i++) {
            int num = scanner.nextInt();
            numbers.add(num);
        }

        sort(numbers);

        System.out.println("Numbers in increasing order:");
        for (int num : numbers) {
            System.out.println(num);
        }
    }

    public static void sort(ArrayList<Integer> list) {
        // Using Collections.sort() method to sort the ArrayList
        Collections.sort(list);
    }
}
