package Unit_3;
import java.util.*;
public class prog8 {
    public static void main(String[] args) {
        Set<String> data=new LinkedHashSet<String>();
        data.add("set");
        data.add("first");
        data.add("second");
        data.add("first");
        data.add("set");
        System.out.println(data);
}

}
