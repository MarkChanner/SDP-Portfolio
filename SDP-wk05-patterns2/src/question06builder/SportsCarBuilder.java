package question06builder;

/**
 * SDP Design Patterns II
 * Question 6 - Builder Pattern
 * Mark Channer
 */
public class SportsCarBuilder implements CarBuilder {

    private Car car;

    @Override
    public void makeCarType() {
        car = new Car("SPORTS");
    }

    @Override
    public void makeBody() {
        car.setBodyStyle("External dimensions: overall length (inches:) 192.3,\n" +
                "overall width (inches): 75.5, overall height (inches): 54.2,\n" +
                "wheelbase (inches): 112.3, front track (inches): 63.7,\n" +
                "rear track (inches): 64.1 and curb to curb turning circle (feet): 37.7");
    }

    @Override
    public void makePower() {
        car.setPower("323 hp @ 6,800 rpm; 278 ft lb of torque @ 4,800 rpm");
    }

    @Override
    public void makeEngine() {
        car.setEngine("3.6L V 6 DOHC and variable valve timing");
    }

    @Override
    public void makeBreaks() {
        car.setBreaks("Four-wheel disc brakes: two ventilate. Electronic brake distribution.\n" +
                "Stability control");
    }

    @Override
    public void makeSeats() {
        car.setSeats("Driver sports front seat with one power adjustments manual height,\n" +
                "front passenger seat sports front seat with one power adjustments");
    }

    @Override
    public void makeWindows() {
        car.setWindows("Front windows with one-touch on two windows");
    }

    @Override
    public void makeFuelType() {
        car.setFuelType("Petrol 17 MPG city, 28 MPG highway, 20 MPG combined and 380 mi. range");
    }

    @Override
    public Car getCar() {
        return car;
    }

}
