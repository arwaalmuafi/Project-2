public class Main {
    public static void main(String[] args) {
        ////////////////////////////////////////////////////////////////////////////////////////
        Route route1 = new Route("123 Riyadh St", "456 Tuwaiq St", 100.0);
        Route route2 = new Route("789 Riyadh St", "101 Tuwaiq St", 150.0);

        ////////////////////////////////////////////////////////////////////////////////////////
        Car car1 = new Car("Porsche 911", route1, 1);
        Car car2 = new Car("Porsche Spider", route2, 0);

        ////////////////////////////////////////////////////////////////////////////////////////
        Passenger[] passengers = new Passenger[2];
        passengers[0] = new Subscribers("arwa", "11326834");
        passengers[1] = new Non_Subscribers("rose", "113267687", false);

        ////////////////////////////////////////////////////////////////////////////////////////
        for (Passenger passenger : passengers) {
            if (passenger != null) {
                try {
                    if (passenger instanceof Subscribers) {
                        passenger.reserveCar(car1);
                    } else {
                        passenger.reserveCar(car2);
                    }
                    passenger.displayInfo();
                    System.out.println("___________________");
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            }
        }
    }
}
