public class Samsung extends Phone implements Printable {

    private String os;

    public Samsung(String model, String os) {
        super(model);
        this.os = os;
    }

    @Override
    public void print() {
        System.out.println("Samsung " + getOs());
    }

    public String getOs() {
        return os;
    }
}
