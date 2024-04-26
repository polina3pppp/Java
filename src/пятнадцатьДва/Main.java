package пятнадцатьДва;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Map<String, House> houses = new HashMap<>();
        houses.put("микрорайон1", new House("дом 1", 3, 5, 10, "центр"));
        houses.put("микрорайон2", new House("дом 2", 2, 4, 8, "пригород"));

        System.out.println("Размер мапы: " + houses.size());

        for (Map.Entry<String, House> entry : houses.entrySet()) {
            System.out.println("Дом в  " + entry.getKey() + ": " + entry.getValue());
        }

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите ключ для поиска количества квартир в  доме:");
        String keyForApartmentsCount = scanner.nextLine();
        if (houses.containsKey(keyForApartmentsCount)) {
            House house = houses.get(keyForApartmentsCount);
            System.out.println("Количество квартир в доме: " + (house.getFloors() * house.getApartmentsPerFloor() * house.getEntrances() ));
            System.out.println("Изменяем количество квартир на этаже у данного дома:");
            int newApartmentsPerFloor = scanner.nextInt();
            house.setApartmentsPerFloor(newApartmentsPerFloor);
        } else {
            System.out.println("Дом с таким ключом не найден");
        }

        System.out.println("Мапа в читаемом виде:");
        int i = 1;
        for (Map.Entry<String, House> entry : houses.entrySet()) {
            System.out.println(i + ". Микрорайон: " + entry.getKey() + ", Дом: " + entry.getValue());
            i++;
        }
    }
}



