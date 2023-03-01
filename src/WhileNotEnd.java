    import java.util.ArrayList;
import java.util.Scanner;

    public class WhileNotEnd {

        public static void main(String[] args) {
            ArrayList<String> strings = new ArrayList<String>(); // создаем список строк
            Scanner scanner = new Scanner(System.in);

            System.out.println("Введите строки (для окончания введите 'end'): ");

            String input = scanner.nextLine(); // считываем первую строку

            while (!input.equals("end")) { // продолжаем ввод, пока не будет введена строка 'end'
                strings.add(input); // добавляем введенную строку в список
                input = scanner.nextLine(); // считываем следующую строку
            }

            System.out.println("Введенные строки: ");
            for (String string : strings) { // выводим все строки из списка
                System.out.println(string);
            }
        }
    }


