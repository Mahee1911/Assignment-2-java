//21CE029 : MAHEE GADHIYA PRAC4 : CLASS
public class ex4_1 extends ex2 {
    //define overdraft limit = 0 
    protected double OVERDRAFT_LIMIT = 0;

    //perameterized constructor with super class argument
    public ex4_1(int id, double balance,String date) {
        super(id, balance, date);
    }

    //override withdraw method
    
    public void withdraw(double amount) {
        if (balance - amount >= OVERDRAFT_LIMIT || balance - amount <= OVERDRAFT_LIMIT) 
            super.withdraw(amount);
        }
    
        //override tostring
    
    public String toString() {
        return "SavingsAccount{" + "net Balance =" + balance +'}';
    }
}