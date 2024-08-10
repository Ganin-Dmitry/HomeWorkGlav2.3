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

        Transport transport = new Transport();
        transport.setModelName("Telega");
        transport.setWheelsCount(3);

        car.check();
        car2.check();
        bicycle.check();
        bicycle2.check();
        truck.check();
        truck2.check();
        transport.check();
        bicycle.checkEngine();

    }
}