package Drivers;

public class DriverB extends Driver{

    public DriverB(String fullName,boolean hasDriverLicense, int experience) {
        super(fullName,hasDriverLicense, experience);
    }


    @Override
    void startDriving() {
        System.out.println("Водитель категории В "  + getFullName() + " заправляет авто");
    }

    @Override
    void stopDriving() {
        System.out.println("Водитель категории В "  + getFullName() + " останавливает авто");
    }

    @Override
    void refuelTransport() {
        System.out.println("Водитель категории В "  + getFullName() + " заправляет авто");
    }
}
