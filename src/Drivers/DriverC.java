package Drivers;

public class DriverC extends Driver{

    public DriverC(String fullName, boolean hasDriverLicense, int experience) {
        super(fullName, hasDriverLicense, experience);
    }


    void startDriving() {
        System.out.println("Водитель категории С "  + getFullName() + " заправляет авто");
    }

    @Override
    void stopDriving() {
        System.out.println("Водитель категории С "  + getFullName() + " останавливает авто");
    }

    @Override
    void refuelTransport() {
        System.out.println("Водитель категории С "  + getFullName() + " заправляет авто");
    }

}
