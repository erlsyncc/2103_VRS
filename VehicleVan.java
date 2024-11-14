
package vehiclerentasystem;

public class VehicleVan {
public class Van extends Vehicles {
    private int cargoCapacity; // in cubic feet
    private int numOfDoors;

    // Constructor
    public Van(String vehicleID, String registrationNumber, String make, String model, double rentalRate, String vehicleStatus, int cargoCapacity, int numOfDoors) {
        super(vehicleID, registrationNumber, make, rentalRate);
        this.cargoCapacity = cargoCapacity;
        this.numOfDoors = numOfDoors;
    }

    // Getters and setters
    public int getCargoCapacity() {
        return cargoCapacity;
    }

    public void setCargoCapacity(int cargoCapacity) {
        this.cargoCapacity = cargoCapacity;
    }

    public int getNumOfDoors() {
        return numOfDoors;
    }

    public void setNumOfDoors(int numOfDoors) {
        this.numOfDoors = numOfDoors;
    }

    @Override
    public String toString() {
        return super.toString() + ", Cargo Capacity=" + cargoCapacity + " cubic feet, Number of Doors=" + numOfDoors + "]";
    }
}

}
