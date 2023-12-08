public class Phone {
    private String model;

    public Phone(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "model='" + model + '\'' +
                '}';
    }
}
