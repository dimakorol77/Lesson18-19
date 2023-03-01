import java.util.ArrayList;
import java.util.Scanner;

public class Dublirovanie {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<>(); // Создаем новый список строк
        for (int i = 0; i < 5; i++) {
            String word = scanner.nextLine(); // Считываем строку с клавиатуры
            words.add(word); // Добавляем строку в список
        }
        doubleValues(words); // Удваиваем каждое слово в списке
        for (String word : words) {
            System.out.println(word); // Выводим список на экран
        }
    }

    public static void doubleValues(ArrayList<String> list) {
        int originalSize = list.size(); // Сохраняем начальный размер списка
        for (int i = 0; i < originalSize; i++) {
            String word = list.get(i); // Получаем элемент списка по индексу i
            list.add(i + 1, word); // Добавляем элемент в список на позицию i + 1
              i++ ; // Увеличиваем i на 1, чтобы пропустить новый элемент списка
            originalSize++; // Увеличиваем начальный размер списка на 1, чтобы цикл продолжался
        }
    }
}
