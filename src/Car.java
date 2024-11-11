class Car {
    private String code;
    private Route route;
    private int maxCapacity;

    public Car(String code, Route route, int maxCapacity) {
        this.code = code;
        this.route = route;
        this.maxCapacity = maxCapacity;
    }

    public String getCode() {
        return code;
    }

    public Route getRoute() {
        return route;
    }

    public int getMaxCapacity() {
        return maxCapacity;
    }

    public void reduceCapacity() {
        if (maxCapacity > 0) {
            maxCapacity--;
        }
    }
}
