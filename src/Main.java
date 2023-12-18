import java.util.*;

public class Main {
    public static void main(String[] args) {
        //Initialize
        Scanner scanner = new Scanner(System.in);
        List<String> listA = new ArrayList<>();
        List<String> listB = new ArrayList<>();
        List<String> listC = new ArrayList<>();

        //Fill listA
        for (int i = 0; i < 5; i++) {
            listA.add(scanner.next());
        }
        System.out.println(listA);

        //Fill listB
        for (int i = 0; i < 5; i++) {
            listB.add(scanner.next());
        }
        System.out.println(listB);

        //Fill listC
        Collections.reverse(listB);
        for (int i = 0; i < listA.size(); i++) {
            listC.add(listA.get(i));
            listC.add(listB.get(i));
        }
        System.out.println(listC);

        //Sort listC
        listC.sort(Comparator.comparing(String::length));

        System.out.println(listC);
    }
}