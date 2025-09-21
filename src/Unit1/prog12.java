package Unit_1;

public class prog12 {
    int balance=100000;
    public void withdraw(int amount){
        if(amount>balance){
            throw new prog12_2("Insufficient balance");
        }
        else{
            balance=balance-amount;
            System.out.println("Withdraw successfull, remaing balance "+ balance);
        }
    }
}
