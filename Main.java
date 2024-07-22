public class Main {
    public static void main(String[] args) {
        //Route obj
        Route route1 = new Route("Riyadh", "Jeddah", 500);
        Route route2 = new Route("annuzha", "olaya", 100);

        //Car obj
        Car car1 = new Car("223d", 0, route2);
        Car car2 = new Car("454d", 20, route1);

        //Array
        Passenger[] passengers = new Passenger[2];

        passengers[0] = new SubscribersPassengers("Danah", "NS123");
        passengers[1] = new NonSubscribersPassengers("Naif", "NS001", true);

        for (Passenger passenger : passengers) {
            try {
                if (passenger instanceof SubscribersPassengers) {
                    passenger.reserveCar(car2);
                } else {
                    passenger.reserveCar(car1);
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

        for (Passenger passenger : passengers) {
            passenger.displayInformation();
            System.out.println("-------------------------------------");
        }
    }

}
