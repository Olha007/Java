package lesson9;

class Truck extends Vehicle {
    Truck(double tonnage) {
        super(tonnage);
    }

    @Override
    public void fly() {
        System.out.println("Truck can`t fly");
    }
}