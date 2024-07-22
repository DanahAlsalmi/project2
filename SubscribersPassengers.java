public class SubscribersPassengers extends Passenger{

    public SubscribersPassengers(String name, String id) {
        super(name, id);
    }

    @Override
    public void reserveCar(Car car) throws Exception {
        if (car.getMaxCapacity() == 0) {
            throw new Exception("Car has reached maximum capacity");
        }
        this.reservedCar = car;
        this.setTripCost(car.getRoute().getTripPrice() * 0.5);
    }




    @Override
    public void displayInformation() {
        System.out.println("\nSubscriber Passenger Information:");
        System.out.println("Name: " + getName());
        System.out.println("ID: " + getId());
        if (reservedCar != null) {
            System.out.println("Car Code: " + reservedCar.getCode());
            System.out.println("Route Price: " + reservedCar.getRoute().getTripPrice());
            System.out.println("Trip Cost: " + getTripCost());
        } else {
            System.out.println("No car reserved.");
        }
        System.out.println();
    }
}
