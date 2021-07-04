package by.teachmeskills.robot.heads;

public class SkolkovoHead implements IHead {

    private int price;

    public SkolkovoHead(int price) {
        this.price = price;
    }

    public SkolkovoHead() {
    }

    @Override
    public void name() {
        System.out.println("Робот Skolkovo");
    }

    @Override
    public void speek() {
        System.out.println("Говорит голова Skolkovo");
    }


    @Override
    public int getPrice() {
        return price;
    }
}
