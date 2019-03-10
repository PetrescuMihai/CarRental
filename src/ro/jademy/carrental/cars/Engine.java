package ro.jademy.carrental.cars;

import java.util.Objects;

public class Engine  {
    private String fuelType; // diesel, gasoline, alternative
    private String transmissionType; // automatic, manual
    private int engineSize; //engine Capacity cc

    public Engine(String fuelType, String transmissionType, int engineSize) {
        this.fuelType = fuelType;
        this.transmissionType = transmissionType;
        this.engineSize = engineSize;
    }




    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public String getTransmissionType() {
        return transmissionType;
    }

    public void setTransmissionType(String transmissionType) {
        this.transmissionType = transmissionType;
    }

    public int getEngineSize() {
        return engineSize;
    }

    public void setEngineSize(int engineSize) {
        this.engineSize = engineSize;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Engine engine = (Engine) o;
        return engineSize == engine.engineSize &&
                fuelType.equals(engine.fuelType) &&
                transmissionType.equals(engine.transmissionType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fuelType, transmissionType, engineSize);
    }

    @Override
    public String toString() {
        return "Engine{" +
                "fuelType='" + fuelType + '\'' +
                ", transmissionType='" + transmissionType + '\'' +
                ", engineSize=" + engineSize +
                '}';
    }
}
