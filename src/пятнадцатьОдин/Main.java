package пятнадцатьОдин;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<Gamer, Integer> scores = new HashMap<>();

        // Ввод имени игрока с консоли
        System.out.print("Введите имя первого игрока: ");
        String playerName1 = scanner.nextLine();
        Gamer player1 = new Gamer(playerName1);

        System.out.print("Введите имя второго игрока: ");
        String playerName2 = scanner.nextLine();
        Gamer player2 = new Gamer(playerName2);

        // Генерация случайного количества очков для каждого игрока
        Random random = new Random();
        int score1 = random.nextInt(101);
        int score2 = random.nextInt(101);

        // Запись очков в Map
        scores.put(player1, score1);
        scores.put(player2, score2);

        // Вывод информации обо всех игроках
        System.out.println("Информация обо всех игроках:");
        for (Map.Entry<Gamer, Integer> entry : scores.entrySet()) {
            System.out.println("Игрок: " + entry.getKey().getName() + ", Очки: " + entry.getValue());
        }

        // Запрос информации по конкретному игроку
        System.out.print("Введите имя игрока для получения информации: ");
        String requestedPlayerName = scanner.nextLine();
        for (Map.Entry<Gamer, Integer> entry : scores.entrySet()) {
            if (entry.getKey().getName().equals(requestedPlayerName)) {
                System.out.println("Игрок: " + entry.getKey().getName() + ", Очки: " + entry.getValue());
                return;
            }
        }
        System.out.println("Игрок с именем " + requestedPlayerName + " не найден.");
    }
}
