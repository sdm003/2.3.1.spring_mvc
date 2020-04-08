package web.model;

public class Car {

    private Integer id;
    private String brand;
    private Integer volume;

    public Car(int id, String brand, int volume) {
        this.id = id;
        this.brand = brand;
        this.volume = volume;
    }

    public Integer getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Integer getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
}
