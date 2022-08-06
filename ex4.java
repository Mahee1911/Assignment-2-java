//21CE029 : MAHEE GADHIYA PRAC4 : CLASS
public class ex4 extends ex2 {

    //take overdraft limit = -100
    protected double OVERDRAFT_LIMIT = -100;

    //create constructor with suoer class arguments
    public ex4(int id, double balance,String date) {
        super(id, balance,date);
    }

    //override withdraw method
   
    public void withdraw(double amount) {
        if (balance - amount >= OVERDRAFT_LIMIT) {
            super.withdraw(amount);
        }
        else
        System.out.println("Over drawing is passing the given limit  :");
    }

    //override tostring method
    
    public String toString() {
        return "CheckingAccount{"+ "mBalance=" + balance +'}';
    }
}
