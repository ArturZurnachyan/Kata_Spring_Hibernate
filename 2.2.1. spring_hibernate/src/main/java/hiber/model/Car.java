package hiber.model;

import javax.persistence.*;


@Entity
@Table(name = "cars")
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "models")
    private String models;

    @Column(name = "series")
    private int series;


    public Car() {
    }

    public Car(String model, int series) {
        this.models = model;
        this.series = series;

    }

    public String getModel() {
        return models;
    }

    public void setModel(String model) {
        this.models = model;
    }

    public int getSeries() {
        return series;
    }


    public void setSeries(int series) {
        this.series = series;
    }

    @Override
    public String toString() {
        return "Car{" +
               ", model='" + models + '\'' +
               ", series=" + series +
               '}';
    }
}
