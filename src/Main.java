import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> name = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        //String name = new String();

        System.out.println("Список А");
        for (int i = 0; i <= 4; i++) {
            name.size();

            if (name.size() <= 0) {
                scanner.next();
//                System.out.println(name);
            }
        }
        ArrayList<String> name2 = new ArrayList<>();
        name2.add("Alex");

        System.out.println("Список Б");
        for (int i = 0; i <= 4; i++) {
            name2.size();

            if (name2.size() <= 0) {
                scanner.next();
            }
        }
        name.addAll(name2);
        System.out.println("Список С");
        System.out.println("Список А " +  name2);
//        name2.add("Alex");
        System.out.println("Список Б");

//        scanner.next();
    }
}