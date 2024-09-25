package homework4.ex1;

public class Car {
    private String carNumber;

    public Car(int num, int area) {
        if (num < 10 && area == 799) {
            this.carNumber = "а00" + num + "ан799";
        } else if (num >= 10 && area == 799) {
            this.carNumber = "а0" + num + "ан799";
        } else if (num < 10 && area == 178) {
            this.carNumber = "к00" + num + "се178";
        } else if (num >= 10 && area == 178) {
            this.carNumber = "к0" + num + "се178";
        }
    }

    public Car(String carNumber) {
        this.carNumber = carNumber;
    }

    @Override
    public String toString() {
        return "№- " + carNumber;
    }

    public String getCarNumber() {
        return carNumber;
    }
}
