package Unit_3;
import java.util.ArrayDeque;
public class prog7 {
        public static void main(String[] args) {
            ArrayDeque<String> arr=new ArrayDeque<>();
            arr.add("First");
            arr.addFirst("Zero");
            arr.addLast("LAst");
            System.out.println(arr);
            System.out.println(arr.offerFirst("MNUS-1"));
            System.out.println(arr.offerLast("LAst last"));
            System.out.println(arr);
        }
    }
