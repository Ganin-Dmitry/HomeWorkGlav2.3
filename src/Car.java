public class Car extends Transport implements MotorTransport, WheeledTransport{

    @Override
    public void check () {
        System.out.println("Обслуживаем " + this.getModelName());
        for (int i = 0; i < this.getWheelsCount(); i++) {
            this.updateTyre();
        }
        this.checkEngine();
        System.out.println(" ");
    }

}