public class Xiaomi extends Phone implements Printable {
    private int price;

    public Xiaomi(String model, int price) {
        super(model);
        this.price = price;
    }

    @Override
    public void print() {
        System.out.println("Xiaomi " + getPrice());
    }

    public int getPrice() {
        return price;
    }
}
