import java.util.ArrayList;
import java.util.Scanner;

public class GameHelper {

    private static final String alphabet = "abcdefg";
    private int gridLength = 7;
    private int gridSize = 49;
    private int[] grid = new int[gridSize];
    private int comCount = 0;

    public String getUserInput(String prompt) {
        System.out.println("Введите число: ");
        Scanner scanner = new Scanner(System.in);
        String inputLine = scanner.nextLine();
        return inputLine.toLowerCase();
    }

    public ArrayList<String> placeDotCom(int comSize) {
        ArrayList<String> alphaCells = new ArrayList<>();

        // Хранит координаты типа f6
        String[] alphacoords = new String[comSize];

        // Временная строка для конкатенации
        String temp = null;

        // Координаты текущего корабля
        int[] coords = new int[comSize];

        // Счетчик текущих попыток
        int attempts = 0;

        // Нашли подходящее местоположение?
        boolean success = false;

        // Текущее начальное местоположение
        int location = 0;

        // Энный корабль для размещения
        comCount++;

        // Устанавливаем горизонтальный инкремент
        int incr = 1;

        // Если нечетный (размещаем вертикально)
        if ((comCount % 2) == 1) {
            incr = gridLength;
        }


        // Главный поисковой цикл
        while (!success && attempts++ < 200) {
            location = (int) (Math.random() * gridSize); // получаем случайную стартовую точку
            int x = 0;                                   // Энная позиция в корабле, который нужно разместить
            success = true;                              // Предполагаем успешный исход

            // Ищем соседнюю неиспользованную ячейку
            while (success && x < comSize) {
                // Если еще не используется
                if (grid[location] == 0) {
                    coords[x++] = location;              // Сохраняем местоположение
                    location += incr;                    // Пробуем следующую соседнюю ячейку

                    // Вышли за рамки - низ
                    if (location >= gridSize) {
                        success = false;                 // Неудача
                    }

                    // Вышли за рамки - край
                    if (x>0 && (location % gridLength == 0)) {
                        success = false;                 // Неудача
                    }

                // Нашли уже используещееся местоположение
                } else {
                    success = false;
                }
            }

        }

        // Переводим местоположение в символьные координаты
        int x = 0;
        int row = 0;
        int column = 0;

        while (x < comSize) {
            // Помечаем ячейки на главной сетке как "использованные"
            grid[coords[x]] = 1;
            // Получаем значение строки
            row = (int) (coords[x] / gridLength);
            // Получем числовое значение столбца
            column = coords[x] % gridLength;
            // Преобразуем его в строковый символ
            temp = String.valueOf(alphabet.charAt(column));
            alphaCells.add(temp.concat(Integer.toString(row)));
            x++;
        }
        return alphaCells;
    }
}
