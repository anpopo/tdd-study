package tdd.study;

public class Dollar {

    public int amount;

    public Dollar(int amount) {
        this.amount = amount;
    }

    public void times(int mutiplier) {
        this.amount *= mutiplier;
    }
}
