class Non_Subscribers extends Passenger {

    public Non_Subscribers(String name, String id, boolean discountCoupon) {
        super(name, id);
    }

    @Override
    public void reserveCar(Car car) throws Exception {
        if (car.getMaxCapacity() == 0) {
            throw new Exception("Car is at maximum capacity");
        }
        setReservedCar(car);
        setTripCost(car.getRoute().getPrice() * 0.9);
        car.reduceCapacity();
    }
}
