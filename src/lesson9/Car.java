package lesson9;

final class Car extends Vehicle {
    public Car(double tonnage) {
        super(tonnage);
    }

    @Override
    public void fly() {
        System.out.println("Car can`t fly");
    }
}
