package шестнадцать;

public class NegativeMinFinder {
    public static void findNegativeMin(float[] array) {
        float min = Float.MAX_VALUE;
        int minIndex = -1;

        boolean foundNegative = false;

        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                foundNegative = true;
                if (array[i] < min) {
                    min = array[i];
                    minIndex = i;
                }
            }
        }

        if (!foundNegative) {
            System.out.println("Отрицательные элементы отсутствуют в массиве.");
        } else {
            System.out.println("Минимум среди отрицательных элементов: " + min);
            System.out.println("Индекс минимального отрицательного элемента: " + minIndex);
        }
    }
}
