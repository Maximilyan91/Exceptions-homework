package Transport;

import Drivers.DriverB;

public class Car extends Transport<DriverB> implements Racing {

    public enum BodyType {
        SEDAN("Седан"),
        HATCHBACK("Хетчбэк"),
        COUPE("Купе"),
        WAGON("Универсал"),
        OFFROAD("Внедорожник"),
        CROSSOVER("Кроссовер"),
        PICKUP("Пикап"),
        VAN("Фургон"),
        MINIVAN("Минивэн");

        private final String bodyType;



        BodyType(String bodyType) {
            this.bodyType = bodyType;
        }

        public String getBodyType() {
            return bodyType;
        }

        @Override
        public String toString() {
            return "Тип кузова - " + bodyType;
        }
    }

    private BodyType currentBodyType;


    public Car(String brand, String model, double engineVolume, DriverB driver, BodyType currentBodyType) {
        super(brand, model, engineVolume, driver);
    setCurrentBodyType(currentBodyType);
    }

    @Override
    public void printType() {
        if (currentBodyType == null) {
            System.out.println("Данных по транспортному средству недостаточно");
        } else {
            System.out.println("Кузов: " + currentBodyType);
        }
    }
    @Override
    public void doDiagnostic() {
        System.out.println(getBrand() + " " + getModel() + " прошла диагностику");
    }

    public void getPitStop(Car car) {
        System.out.println(car.getBrand() + " " + car.getModel() + " - съехал с дистанции на питстоп!");
    }
    public void getBestTimeLap(Car car) {
        System.out.println(car.getBrand() + " " + car.getModel() + " - Лучшее время круга!");
    }
    public void getMaxSpeed(Car car) {
        System.out.println(car.getBrand() + " " + car.getModel() + " - Набрал максимальную скорость!");

    }

    public BodyType getCurrentBodyType() {
        return currentBodyType;
    }

    public void setCurrentBodyType(BodyType currentBodyType) {
        this.currentBodyType = currentBodyType;
    }

}

