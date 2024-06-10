public abstract class Transport extends ServiceVehicle {

    private String modelName;
    private int wheelsCount;

    public Transport(String modelName, int wheelsCount) {
        this.modelName = modelName;
        this.wheelsCount = wheelsCount;
    }


    public String getModelName(){return modelName; }
    public void updateTyre() {
        for (int i = 0; i < wheelsCount; i ++) {
            System.out.println("Меняем покрышку");
        }
    }
}
