class Subscribers extends Passenger {
    public Subscribers(String name, String id) {
        super(name, id);
    }

    @Override
    public void reserveCar(Car car) throws Exception {
        if (car.getMaxCapacity() == 0) {
            throw new Exception("Car is at maximum capacity");
        }
        setReservedCar(car);
        setTripCost(car.getRoute().getPrice() * 0.5);
        car.reduceCapacity();
    }
}
