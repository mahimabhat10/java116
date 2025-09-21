package Unit_3;

import java.util.ArrayList;
import java.util.Collections;
public class prog14 {
    public static void main(String[] args) {
        ArrayList<Integer> al= new ArrayList<>();
        al.add(12);
        al.add(15);
        al.add(0);
        al.add(-56);
        al.add(-5);
        Collections.sort(al);
        System.out.println(al);
    }
}
