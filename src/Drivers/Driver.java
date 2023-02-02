package Drivers;

public abstract class Driver {

    private final String fullName;
    private boolean hasDriverLicense;
    private int experience;

    public Driver(String fullName) {
        this.fullName = fullName;
    }

    public Driver(String fullName, boolean hasDriverLicense, int experience) {
        this.fullName = fullName;
        setHasDriverLicense(hasDriverLicense);
        this.experience = experience;
    }

    public String getFullName() {
        return fullName;
    }

    public boolean getHasDriverLicense() {
        return hasDriverLicense;
    }

    public void setHasDriverLicense(boolean hasDriverLicense) {
        this.hasDriverLicense = hasDriverLicense;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }


    @Override
    public String toString() {
        return "Driver{" +
                "fullName='" + fullName + '\'' +
                ", hasDriverLicense=" + hasDriverLicense +
                ", experience=" + experience +
                '}';
    }

    void startDriving() {
    }

    void stopDriving() {
    }

    void refuelTransport() {
    }

}


