import java.util.LinkedList;
import java.util.Scanner;

public class Nchisel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        LinkedList<Integer> list = getIntegerList(scanner, n);
        int min = getMinimum(list);
        System.out.println("Minimum: " + min);
    }

    private static LinkedList<Integer> getIntegerList(Scanner scanner, int n) {
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            int num = scanner.nextInt();
            list.add(num);
        }
        return list;
    }

    private static int getMinimum(LinkedList<Integer> list) {
        int min = Integer.MAX_VALUE;
        for (int num : list) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }
}

