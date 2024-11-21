package vehiclerentasystem;

public class VehicleSuv extends Vehicles {
    private int seatingCapacity;
    private boolean isFourWheelDrive;

    // Constructor
    public VehicleSuv (String vehicleID, String registrationNumber, String make, String model, double rentalRate, String vehicleStatus, int seatingCapacity, boolean isFourWheelDrive) {
         super(vehicleID, registrationNumber, make, rentalRate);
        this.seatingCapacity = seatingCapacity;
        this.isFourWheelDrive = isFourWheelDrive;
    }

    // Getters and setters
    public int getSeatingCapacity() {
        return seatingCapacity;
    }

    public void setSeatingCapacity(int seatingCapacity) {
        this.seatingCapacity = seatingCapacity;
    }

    public boolean isFourWheelDrive() {
        return isFourWheelDrive;
    }

    public void setFourWheelDrive(boolean isFourWheelDrive) {
        this.isFourWheelDrive = isFourWheelDrive;
    }

    @Override
    public String toString() {
        return super.toString() + ", Seating Capacity=" + seatingCapacity + ", Four Wheel Drive=" + isFourWheelDrive + "]";
    }
}