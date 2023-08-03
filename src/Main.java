import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Logger logger = Logger.getInstance();
        logger.log("Запускаем программу");
        logger.log("Просим пользователя ввести входные данные для списка");
        Scanner scanner = new Scanner(System.in);
        logger.log("Введите размер списка: ");
        int sizeList = scanner.nextInt();
        logger.log("Введите верхнюю границу для значений: ");
        int higtSize = scanner.nextInt();
        logger.log("Создаём и наполняем список");
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < sizeList; i++) {
            Random random = new Random();
            list.add(random.nextInt(higtSize));
        }
        logger.log("Вот случайный список: " + list);
        logger.log("Просим пользователя ввести входные данные для фильтрации");
        logger.log("Введите порог для фильтра: ");
        int intFilter = scanner.nextInt();
        Filter filter = new Filter(intFilter);
        logger.log("Запускаем фильтрацию");
        List<Integer> listFilter = filter.filterOut(list);
        logger.log("Выводим результат на экран");
        logger.log("Отфильтрованный список: " + listFilter);
        logger.log("Завершаем программу");
    }
}