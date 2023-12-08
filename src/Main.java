import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Printable[] printables = {
                createObject("Samsung"),
                createObject("Iphone"),
                createObject("Xiaomi")
        };

        Arrays.stream(printables).forEach(Printable::print);

    }

    public static Printable createObject(String className) {

        switch (className) {
            case "Samsung" -> {
                return new Samsung("S23 Ultra", "Android");
            }
            case "Iphone" -> {
                return new Iphone("14 PRO MAX", "Gold");
            }
            case "Xiaomi" -> {
                return new Xiaomi("Note 10", 17000);
            }
        }
        return null;
    }
}