package семнадцать;

public class Lake {
    private String name;
    private String location;
    private double area;

    public Lake(String name, String location, double area) {
        this.name = name;
        this.location = location;
        this.area = area;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    @Override
    public String toString() {
        return "Lake{" +
                "название='" + name + '\'' +
                ", место расположение='" + location + '\'' +
                ", площадь=" + area +
                '}';
    }
}
