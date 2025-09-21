package Unit_3;

import java.util.HashMap;
import java.util.Scanner;

public class prog13 {
    public static void main(String[] args) {
        HashMap<String,Integer> hm= new HashMap<>();
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        sc.nextLine();
        for(int i=0;i<n;i++){
            String[] word= sc.nextLine().split(" ");
            String query= word[0];
            String key=word[1];
            if (query.equals ("add")){
                hm.put(key,hm.getOrDefault(key,0)+1);
            }
            else if(query.equals("count")){
                System.out.println(hm.getOrDefault(key,0));
            }
            else if(query.equals("remove")){
                if (hm.containsKey(key)){
                    hm.put(key,hm.get(key)-1);
                }
            }
        }
    }
}
