public class Bicycle extends Transport {

    @Override
    public void check () {
        System.out.println("Обслуживаем " + this.getModelName());
        for (int i = 0; i < this.getWheelsCount(); i++) {
            this.updateTyre();
        }
        System.out.println(" ");
    }

    @Override
    public void checkEngine () {
        System.out.println("У данного вида транспорта нет двигателя");
    }

    @Override
    public void checkTrailer () {
        System.out.println("У данного вида транспорта нет прицепа");
    }
}
