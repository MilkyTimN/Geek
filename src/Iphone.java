public class Iphone extends Phone implements Printable{

    private String color;

    public Iphone(String model, String color) {
        super(model);
        this.color = color;
    }

    @Override
    public void print() {
        System.out.println("IPhone " + getColor());
    }

    public String getColor() {
        return color;
    }
}
