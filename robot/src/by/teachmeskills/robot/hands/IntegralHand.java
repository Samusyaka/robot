package by.teachmeskills.robot.hands;

public class IntegralHand implements IHand{
    private int price;

    public IntegralHand(int price) {
        this.price = price;
    }

    public IntegralHand() {
    }

    @Override
    public void upHand() {
        System.out.println("Машем рукой Integral");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
