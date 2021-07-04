package by.teachmeskills.robot.heads;

public class IntegralHead implements IHead{

    private int price;

    public IntegralHead(int price) {
        this.price = price;
    }

    public IntegralHead() {
    }

    @Override
    public void name() {
        System.out.println("Робот Integral");
    }

    public void speek() {
        System.out.println("Говорит голова Integral");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
