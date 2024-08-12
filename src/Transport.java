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

}
