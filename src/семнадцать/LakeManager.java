package семнадцать;

import java.util.Arrays;

public class LakeManager {
    private Lake[] lakes;

    public LakeManager(Lake[] lakes) {
        this.lakes = lakes;
    }

    public Lake findLargestLake() {
        Lake largestLake = lakes[0];
        for (Lake lake : lakes) {
            if (lake.getArea() > largestLake.getArea()) {
                largestLake = lake;
            }
        }
        return largestLake;
    }

    public int countLakesWithAreaLessThanAverage() {
        double totalArea = 0;
        for (Lake lake : lakes) {
            totalArea += lake.getArea();
        }
        double averageArea = totalArea / lakes.length;

        int count = 0;
        for (Lake lake : lakes) {
            if (lake.getArea() < averageArea) {
                count++;
            }
        }
        return count;
    }

    public void sortLakesByName() {
        Arrays.sort(lakes, (lake1, lake2) -> lake1.getName().compareTo(lake2.getName()));
    }

    public Lake findLakeByName(String name) {
        for (Lake lake : lakes) {
            if (lake.getName().equals(name)) {
                return lake;
            }
        }
        return null;
    }
}
