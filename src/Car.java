public class Car extends Transport {

    public static void check (Car car) {
        System.out.println("Обслуживаем " + car.getModelName());
        for (int i = 0; i < car.getWheelsCount(); i++) {
            ServiceStation.updateTyre();
        }
        ServiceStation.checkEngine();
        System.out.println(" ");
    }

}