package семнадцать;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Lake lake1 = new Lake("Байкал", "Россия", 31722);
        Lake lake2 = new Lake("Верхнее", "Канада", 82414);
        Lake lake3 = new Lake("Маракайбо", "Венесуэла", 13300);

        Lake[] lakes = {lake1, lake2, lake3};
        LakeManager manager = new LakeManager(lakes);

        System.out.println("Самое большое озеро: " + manager.findLargestLake());
        System.out.println("Количество озер с площадью меньше средней: " + manager.countLakesWithAreaLessThanAverage());

        manager.sortLakesByName();
        System.out.println("Отсортированный список озер:");
        for (Lake lake : lakes) {
            System.out.println(lake);
        }

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите название озера для поиска: ");
        String searchName = scanner.nextLine();
        Lake foundLake = manager.findLakeByName(searchName);

        if (foundLake != null) {
            System.out.println("Найденное озеро: " + foundLake);
            System.out.print("Введите новую площадь для озера: ");
            double newArea = Double.parseDouble(scanner.nextLine());
            foundLake.setArea(newArea);
            System.out.println("Информация об озере после изменений: " + foundLake);
        } else {
            System.out.println("Озеро с таким названием не найдено.");
        }
    }
}
