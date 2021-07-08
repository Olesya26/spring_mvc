package web.model;

public class Car {
    private String model;
    private int carYear;
    private String engine;

    public Car(String model, int carYear, String engine) {
        this.model = model;
        this.carYear = carYear;
        this.engine = engine;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getCarYear() {
        return carYear;
    }

    public void setCarYear(int carYear) {
        this.carYear = carYear;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }
}
