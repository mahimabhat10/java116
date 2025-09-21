package Unit_1;

public class CollegeStudent extends pp4{
    public CollegeStudent(String name, int roll_no) {
        super(name, roll_no);
    }

    public void attend_class(){
        System.out.println(name+" Pdhne betho");
     }
     public void give_exam(){
         System.out.println(roll_no+" Give exam in online mode");
     }
}
