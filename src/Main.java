public class Main {
    public static void main(String[] args) {

        Car car = new Car();
        Car car2 = new Car();
        car.setModelName("Mercedes");
        car2.setModelName("Volkswagen");
        car.setWheelsCount(4);
        car2.setWheelsCount(4);

        Truck truck = new Truck();
        Truck truck2 = new Truck();
        truck.setModelName("Shacman");
        truck2.setModelName("Kamaz");
        truck.setWheelsCount(8);
        truck2.setWheelsCount(6);

        Bicycle bicycle = new Bicycle();
        Bicycle bicycle2 = new Bicycle();
        bicycle.setModelName("Forward");
        bicycle2.setModelName("Stels");
        bicycle.setWheelsCount(2);
        bicycle2.setWheelsCount(2);

        Car.check(car);
        Car.check(car2);
        Bicycle.check(bicycle);
        Bicycle.check(bicycle2);
        Truck.check(truck);
        Truck.check(truck2);

    }
}