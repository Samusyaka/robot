package by.teachmeskills.robot.legs;

public class IntegralLeg implements ILeg {
    private int price;

    public IntegralLeg(int price) {
        this.price = price;
    }

    public IntegralLeg() {
    }

    @Override
    public void step() {
        System.out.println("Шагает нога Integral");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
