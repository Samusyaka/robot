package by.teachmeskills.robot.legs;

public class SkolkovoLeg implements ILeg{
    private int price;

    public SkolkovoLeg(int price) {
        this.price = price;
    }

    public SkolkovoLeg() {
    }

    @Override
    public void step() {
        System.out.println("Шагает нога Skolkovo");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
