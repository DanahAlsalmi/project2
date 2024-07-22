public class Car {
    private String code;
    private int maxCapacity;
    private Route route;

    public Car(String code, int maxCapacity, Route route) {
        this.code = code;
        this.maxCapacity = maxCapacity;
        this.route = route;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public int getMaxCapacity() {
        return maxCapacity;
    }

    public void setMaxCapacity(int maxCapacity) {
        this.maxCapacity = maxCapacity;
    }

    public Route getRoute() {
        return route;
    }

    public void setRoute(Route route) {
        this.route = route;
    }
}
