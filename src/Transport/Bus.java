package Transport;

import Drivers.DriverD;

public class Bus extends Transport<DriverD> implements Racing{

    public enum Capacity {
        VERY_SMALL(null,10),
        SMALL(null, 25),
        AVERAGE(40,50),
        BIG(60,80),
        VERY_BIG(100,120);

        private final Integer MIN_VALUE;
        private final Integer MAX_VALUE;

        Capacity(Integer MIN_VALUE, Integer MAX_VALUE) {
            this.MIN_VALUE = MIN_VALUE;
            this.MAX_VALUE = MAX_VALUE;
        }

        @Override
        public String toString() {
            if (MIN_VALUE == null) {
                return "Вместимость до: " + MAX_VALUE + " человек";
            }
            return "Вместимость: " + MIN_VALUE + " - " + MAX_VALUE + " человек";
        }

    }

    private Capacity capacity;

    public Bus(String brand, String model, double engineVolume, DriverD driver, Capacity capacity) {
        super(brand, model, engineVolume, driver);
    }

    @Override
    public void printType() {
        if (capacity == null) {
            System.out.println("Данных по транспортному средству недостаточно");
        } else {
            System.out.println("Кузов: " + capacity);
        }
    }

    public void getPitStop(Bus bus) {
        System.out.println(bus.getBrand() + " " + bus.getModel() + " - съехал с дистанции на питстоп!");
    }
    public void getBestTimeLap(Bus bus) {
        System.out.println(bus.getBrand() + " " + bus.getModel() + " - Лучшее время круга!");
    }
    public void getMaxSpeed(Bus bus) {
        System.out.println(bus.getBrand() + " " + bus.getModel() + " - Набрал максимальную скорость!");

    }

    public Capacity getCapacity() {
        return capacity;
    }

    public void setCapacity(Capacity capacity) {
        this.capacity = capacity;
    }
}
