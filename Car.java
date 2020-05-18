public class Car {
    public static void main(String[] args) {

        Car car = new Car("Mazda", "6", 2009);
        System.out.print(car.toString());
        System.out.println(car.isDecade() + "\n");

    }

    private String make, model;
    private int year;

    Car() {

    }

    Car(String make, String model) {
        this.make = make;
        this.model = model;
    }

    Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public boolean isDecade() {
        return year % 10 == 0;
    }

    @Override
    public String toString() {
        return "Make: " + make + "\n" + "Model: " + model + "\n" + "Year: " + year;
    }
}