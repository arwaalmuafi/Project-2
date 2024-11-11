abstract class Passenger {
    private String name;
    private String id;
    private Car reservedCar;
    private double tripCost;

    public Passenger(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public void setReservedCar(Car reservedCar) {
        this.reservedCar = reservedCar;
    }

    public void setTripCost(double tripCost) {
        this.tripCost = tripCost;
    }
    public abstract void reserveCar(Car car) throws Exception;
    public void displayInfo() {
        System.out.println("Passenger Name: " + name);
        System.out.println("Passenger ID: " + id);
        if (reservedCar != null) {
            System.out.println("Car Code: " + reservedCar.getCode());
            System.out.println("Route Price: " + reservedCar.getRoute().getPrice());
        }
        System.out.println("Trip Cost: " + tripCost);
    }
}