public class Car extends Transport {

    @Override
    public void check () {
        System.out.println("Обслуживаем " + this.getModelName());
        for (int i = 0; i < this.getWheelsCount(); i++) {
            this.updateTyre();
        }
        this.checkEngine();
        System.out.println(" ");
    }

    @Override
    public void checkTrailer () {
        System.out.println("У данного вида транспорта нет прицепа");
    }

}