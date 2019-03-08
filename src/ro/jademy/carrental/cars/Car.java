package ro.jademy.carrental.cars;

import java.util.Objects;

public class Car {

    // Q: how can we better represent the car make?
    private String make;
    private String model;
    private Integer year;


    // Q: how can we better represent the car type?
    private String carType; // coupe, sedan, hatchback, convertible, wagon, SUV

    // Q: how can we better represent the motor type?


    private Integer doorNumber;

    private String color;


    // Q: how can we better represent money value?
    private int basePrice;

    // Q: do we need a constructor other than the default one?
    // Q: how can we better protect the car data?
    private Engine motor;

    public Car(String make, String model, Integer year, String carType, Integer doorNumber, String color, int basePrice, Engine motor) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.carType = carType;
        this.doorNumber = doorNumber;
        this.color = color;
        this.basePrice = basePrice;
        this.motor = motor;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String getCarType() {
        return carType;
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }

    public Integer getDoorNumber() {
        return doorNumber;
    }

    public void setDoorNumber(Integer doorNumber) {
        this.doorNumber = doorNumber;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(int basePrice) {
        this.basePrice = basePrice;
    }

    public Engine getMotor() {
        return motor;
    }

    public void setMotor(Engine motor) {
        this.motor = motor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return make.equals(car.make) &&
                model.equals(car.model) &&
                year.equals(car.year) &&
                carType.equals(car.carType) &&
                doorNumber.equals(car.doorNumber) &&
                color.equals(car.color) &&

                motor.equals(car.motor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(make, model, year, carType, doorNumber, color, basePrice, motor);
    }

    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", carType='" + carType + '\'' +
                ", doorNumber=" + doorNumber +
                ", color='" + color + '\'' +
                ", basePrice='" + basePrice + '\'' +
                ", motor=" + motor +
                '}';
    }
}
