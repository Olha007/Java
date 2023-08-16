package lesson9;

class Animal implements Flyable {
    private final String feed;

    public void fly() {
    }

    public Animal(String feed) {
        this.feed = feed;
    }

    public String getFeed() {
        return feed;
    }

}
