package homework4.ex1;

public class Car {
    private String carNumber;
    private int partNum;

    public Car(int num, int area) {
        if (num < 10 && area == Area.MOSCOW.getArea()) {
            this.carNumber = "а00" + num + "ан799";
        } else if (num >= 10 && area == Area.MOSCOW.getArea()) {
            this.carNumber = "а0" + num + "ан799";
        } else if (num < 10 && area == Area.SPB.getArea()) {
            this.carNumber = "к00" + num + "се178";
        } else if (num >= 10 && area == Area.SPB.getArea()) {
            this.carNumber = "к0" + num + "се178";
        }
        this.partNum = num;
    }

    @Override
    public String toString() {
        return carNumber;
    }

    public String getCarNumber() {
        return carNumber;
    }

    public int getPartNum() {
        return partNum;
    }
}
