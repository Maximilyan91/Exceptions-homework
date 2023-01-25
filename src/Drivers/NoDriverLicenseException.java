package Drivers;

public class NoDriverLicenseException extends Exception{
    public NoDriverLicenseException() {
        super("Необходимо наличие водительских прав!");
    }

}
