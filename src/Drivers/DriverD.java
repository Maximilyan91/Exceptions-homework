package Drivers;

public class DriverD extends Driver {

    public DriverD(String fullName, boolean hasDriverLicense, int experience) {
        super(fullName, hasDriverLicense, experience);
    }

    void startDriving() {
        System.out.println("Водитель категории D "  + getFullName() + " заправляет авто");
    }

    @Override
    void stopDriving() {
        System.out.println("Водитель категории D "  + getFullName() + " останавливает авто");
    }

    @Override
    void refuelTransport() {
        System.out.println("Водитель категории D "  + getFullName() + " заправляет авто");
    }
}
