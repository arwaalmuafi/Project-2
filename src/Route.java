class Route {

    private double price;

    public Route(String startAddress, String destinationAddress, double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
}
