package Unit_1;

public class prog11_2 {
    public void validate(int age) throws prog11{
        if(age<18)
            throw new prog11("Not eligibe to vote");
        else{
            System.out.println("Eligible to vote");
        }
    }
}
