package lesson9;

final class Cat extends Animal {
    public Cat(String feed) {
        super(feed);
    }

    @Override
    public void fly() {
        System.out.println("Cat can`t fly");
    }
}
