public class Car {
    private String makeModel;
    private String engineType;
    private String ownerName;

    public Car(String makeModel, String engineType, String ownerName) {
        this.makeModel = makeModel;
        this.engineType = engineType;
        this.ownerName = ownerName;
    }

    public void displayCarInfo() {
        System.out.println("Make/Model: " + makeModel);
        System.out.println("Engine Type: " + engineType);
        System.out.println("Owner: " + ownerName);
    }


}

/*для 1го завдання*/
