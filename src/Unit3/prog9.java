package Unit_3;
import java.util.HashSet;
import java.util.Scanner;

public class prog9 {
    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<>();
        HashSet<String> hs1 = new HashSet<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of elements in hs1: ");
        int n = sc.nextInt();

        System.out.println("Enter no of elements in hs2: ");
        int m = sc.nextInt();
        System.out.println("Enter elements in hs1: ");
        for (int i = 0; i < n; i++) {
            hs.add(sc.next());
        }
        System.out.println("Enter elements in hs1: ");
        for (int i = 0; i < m; i++) {
            hs1.add(sc.next());
        }
        System.out.println("Add union2: ");
        System.out.println(hs.addAll(hs1));
        System.out.println(hs);
        hs.removeAll(hs1);
        System.out.println(hs);
        hs.removeIf(str-> str.contains("aa"));
        System.out.println(hs);
    }
}
