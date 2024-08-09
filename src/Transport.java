public class Transport {

    private String modelName;
    private int wheelsCount;

    public String getModelName () {
        return this.modelName;
    }

    public int getWheelsCount () {
        return this.wheelsCount;
    }

    public void setModelName (String newModelName) {
        this.modelName = newModelName;
    }

    public void setWheelsCount (int newWheelsCount) {
        this.wheelsCount = newWheelsCount;
    }

    public void check () {
        System.out.println("Проверяем работоспособность транспорта");
    }

    public void updateTyre() {
        System.out.println("Меняем покрышку");
    }

    public void checkEngine() {
        System.out.println("Проверяем двигатель");
    }

    public void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }

}
