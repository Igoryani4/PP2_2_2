package web.model;


import java.util.ArrayList;
import java.util.List;

public class Car {

    private String model;
    private String version;
    private String color;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Car(String model, String version, String color) {
        this.model = model;
        this.version = version;
        this.color = color;
    }




}
