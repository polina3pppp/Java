package пятнадцатьДва;

public class House {
    private String name;
    private int entrances;
    private int floors;
    private int apartmentsPerFloor;
    private String district;

    public House(String name, int entrances, int floors, int apartmentsPerFloor, String district) {
        this.name = name;
        this.entrances = entrances;
        this.floors = floors;
        this.apartmentsPerFloor = apartmentsPerFloor;
        this.district = district;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEntrances() {
        return entrances;
    }

    public void setEntrances(int entrances) {
        this.entrances = entrances;
    }

    public int getFloors() {
        return floors;
    }

    public void setFloors(int floors) {
        this.floors = floors;
    }

    public int getApartmentsPerFloor() {
        return apartmentsPerFloor;
    }

    public void setApartmentsPerFloor(int apartmentsPerFloor) {
        this.apartmentsPerFloor = apartmentsPerFloor;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    @Override
    public String toString() {
        return "House{" +
                "название='" + name +
                ", подъезды=" + entrances +
                ", этажи=" + floors +
                ", квартир на этаже=" + apartmentsPerFloor +
                ", район='" + district +
                '}';
    }
}
