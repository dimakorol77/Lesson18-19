    import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

    public class GorodISemya {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            Map<String, String> families = new HashMap<>();

            // заполнение карты
            while (true) {
                System.out.print("Введите город (или \"стоп\" для окончания ввода): ");
                String city = scanner.nextLine();
                if (city.equals("стоп")) {
                    break;
                }
                System.out.print("Введите фамилию семьи: ");
                String family = scanner.nextLine();
                families.put(city, family);
            }

            // поиск фамилии по городу
            System.out.print("Введите город, чтобы узнать, кто там живет: ");
            String city = scanner.nextLine();
            String family = families.get(city);
            if (family == null) {
                System.out.println("В этом городе никто не живет.");
            } else {
                System.out.println("В городе " + city + " живут " + family + ".");
            }
        }
    }


