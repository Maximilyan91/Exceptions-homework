import Drivers.DriverB;
import Drivers.DriverC;
import Drivers.DriverD;
import Transport.Bus;
import Transport.Car;
import Transport.Truck;

public class Main {
    public static void main(String[] args) {

        Car car1 = new Car("Car brand 1", "model 1", 1.0, new DriverB("DriverB1",true, 1), Car.BodyType.COUPE);
        Car car2 = new Car("Car brand 2", "model 2", 2.0, new DriverB("DriverB2",true, 1), Car.BodyType.SEDAN);
        Car car3 = new Car("Car brand 3", "model 3", 3.0, new DriverB("DriverB3",true, 1), Car.BodyType.HATCHBACK);
        Car car4 = new Car("Car brand 4", "model 4", 4.0, new DriverB("DriverB4",true, 1), Car.BodyType.PICKUP);

        Bus bus1 = new Bus("Bus brand 1", "Bus model 1", 1.0, new DriverD("DriverD1", true, 5), null);
        Bus bus2 = new Bus("Bus brand 2", "Bus model 2", 2.0, new DriverD("DriverD2", true, 5), null);
        Bus bus3 = new Bus("Bus brand 3", "Bus model 3", 3.0, new DriverD("DriverD3", true, 5), null);
        Bus bus4 = new Bus("Bus brand 4", "Bus model 4", 4.0, new DriverD("DriverD4", true, 5), null);

        Truck truck1 = new Truck("Truck brand 1", "Truck model 1", 1.0, new DriverC("DriverC1", true, 7), null);
        Truck truck2 = new Truck("Truck brand 2", "Truck model 2", 2.0, new DriverC("DriverC2", true, 7), null);
        Truck truck3 = new Truck("Truck brand 3", "Truck model 3", 3.0, new DriverC("DriverC3", true, 7), null);
        Truck truck4 = new Truck("Truck brand 4", "Truck model 4", 4.0, new DriverC("DriverC4", true, 7), null);

        car2.getPitStop(car2);
        bus1.getBestTimeLap(bus1);
        truck3.getMaxSpeed(truck3);

        car2.printInfo();
        bus1.printInfo();

        System.out.println(Car.BodyType.COUPE);
        System.out.println(Truck.Tonnage.N1);
        System.out.println(Bus.Capacity.AVERAGE);

        car2.printType();
        bus1.printType();
        truck3.printType();
        car3.doDiagnostic();

    }
}