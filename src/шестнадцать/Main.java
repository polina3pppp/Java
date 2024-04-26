package шестнадцать;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите размер массива: ");
        int size = scanner.nextInt();

        float[] array = new float[size];

        for (int i = 0; i < size; i++) {
            try {
                System.out.print("Введите элемент массива #" + i + ": ");
                array[i] = scanner.nextFloat();
            } catch (InputMismatchException e) {
                System.out.println("Ошибка: Введена строка вместо числа. Пожалуйста, введите число.");
                scanner.nextLine(); // Очистка буфера сканера
                i--; // Повторный ввод для текущего индекса
            }
        }

        NegativeMinFinder.findNegativeMin(array);
    }
}
