public class Truck extends Transport {

    public static void check (Truck truck) {
        System.out.println("Обслуживаем " + truck.getModelName());
        for (int i = 0; i < truck.getWheelsCount(); i++) {
            ServiceStation.updateTyre();
        }
        ServiceStation.checkEngine();
        ServiceStation.checkTrailer();
        System.out.println(" ");
    }

}