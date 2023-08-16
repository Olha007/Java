package lesson9;

class Duck extends Animal {
    public Duck(String feed) {
        super(feed);
    }

    @Override
    public void fly() {
        System.out.println("Duck is flying");
    }
}