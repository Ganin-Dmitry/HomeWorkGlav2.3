public class Bicycle extends Transport {

    public static void check (Bicycle bicycle) {
        System.out.println("Обслуживаем " + bicycle.getModelName());
        for (int i = 0; i < bicycle.getWheelsCount(); i++) {
            ServiceStation.updateTyre();
        }
        System.out.println(" ");
    }

}
