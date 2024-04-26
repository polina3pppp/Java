package четырнадцатьДва;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Collections;

public class Fish {
    private List<String> списокРыб;

    public Fish(List<String> списокРыб) {
        this.списокРыб = new ArrayList<>(списокРыб);
    }

    public void удалитьДубликаты() {
        списокРыб = new ArrayList<>(new HashSet<>(списокРыб));
    }

    public void сортировать() {
        Collections.sort(списокРыб);
    }

    public void заменитьРыбу(String стараяРыба, String новаяРыба) {
        int индекс = списокРыб.indexOf(стараяРыба);
        if (индекс != -1) {
            списокРыб.set(индекс, новаяРыба);
        }
    }

    public void поменятьМестамиРыб(int индекс1, int индекс2) {
        if (индекс1 >= 0 && индекс1 < списокРыб.size() && индекс2 >= 0 && индекс2 < списокРыб.size()) {
            Collections.swap(списокРыб, индекс1, индекс2);
        }
    }

    public void удалитьПоследнююРыбу() {
        if (!списокРыб.isEmpty()) {
            списокРыб.remove(списокРыб.size() - 1);
        }
    }

    @Override
    public String toString() {
        return списокРыб.toString();
    }
}

