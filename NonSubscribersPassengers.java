public class NonSubscribersPassengers extends Passenger{
    private boolean discountCoupon;

    public NonSubscribersPassengers(String name, String id, boolean discountCoupon) {
        super(name, id);
        this.discountCoupon = discountCoupon;
    }


    @Override
    public void reserveCar(Car car) throws Exception {
        if (car.getMaxCapacity() == 0) {
            throw new Exception("Car has reached maximum capacity");
        }
        this.reservedCar = car;
        if (discountCoupon) {
            this.setTripCost(car.getRoute().getTripPrice() - (car.getRoute().getTripPrice() * 0.1));
        } else {
            this.setTripCost(car.getRoute().getTripPrice());
        }
    }



    @Override
    public void displayInformation() {
        System.out.println("Non-Subscriber Passenger Information:");
        System.out.println("Name: " + getName());
        System.out.println("ID: " + getId());
        if (reservedCar != null) {
            System.out.println("Car Code: " + reservedCar.getCode());
            System.out.println("Route Price: " + reservedCar.getRoute().getTripPrice());
            System.out.println("Trip Cost: " + getTripCost());
        } else {
            System.out.println("No car reserved.");
        }

    }
}
