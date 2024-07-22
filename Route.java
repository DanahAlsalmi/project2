public class Route {
    private String startAddress;
    private String destination;
    private int tripPrice;

    public Route(String startAddress, String destination, int tripPrice) {
        this.startAddress = startAddress;
        this.destination = destination;
        this.tripPrice = tripPrice;
    }

    public String getStartAddress() {
        return startAddress;
    }

    public void setStartAddress(String startAddress) {
        this.startAddress = startAddress;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getTripPrice() {
        return tripPrice;
    }

    public void setTripPrice(int tripPrice) {
        this.tripPrice = tripPrice;
    }
}
