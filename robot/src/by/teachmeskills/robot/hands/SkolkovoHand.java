package by.teachmeskills.robot.hands;

public class SkolkovoHand implements IHand{
    private int price;

    public SkolkovoHand(int price) {
        this.price = price;
    }

    public SkolkovoHand() {
    }

    @Override
    public void upHand() {
        System.out.println("Машем рукой Skolkovo");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
