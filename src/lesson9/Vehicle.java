package lesson9;

abstract class Vehicle implements Flyable {
    private final double tonnage;

    Vehicle(double tonnage) {
        this.tonnage = tonnage;
    }

    public double getTonnage() {
        return tonnage;
    }
}
