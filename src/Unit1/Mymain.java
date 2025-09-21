package Unit_1;

public class Mymain {
    public static void main(String[] args){
        pp1 s1= new pp1(21,"ity");
        pp1 s2=new pp1(51,"nichhal");
        s1.display();
        s2.display();
        /*because java does not support
        copy constructor*/
        pp1 s3= new pp1(s1);
    }
}
