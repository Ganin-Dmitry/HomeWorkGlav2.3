public class Truck extends Transport implements WheeledTransport, MotorTransport, TrailerTransport {

    @Override
    public void check () {
        System.out.println("Обслуживаем " + this.getModelName());
        for (int i = 0; i < this.getWheelsCount(); i++) {
            this.updateTyre();
        }
        this.checkEngine();
        this.checkTrailer();
        System.out.println(" ");
    }

}