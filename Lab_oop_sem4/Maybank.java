class Maybank { //super class
    protected double balance;
    public Maybank(double balance){
        this.balance= balance;
    }
    public void deposit(double amount){
        balance += amount;
    }
    public void withdraw(double amount){
        if(amount <= balance){
            balance -= amount ;
        }else {
            System.out.println("insufficient funds");
        }
    }
    public double getBalance(){
        return balance;
    }
}
class Mae extends Maybank{ // subclass
    private double cashBackRate;
    public Mae(double balance,double cashBackRate){
        super(balance);
        this.cashBackRate = cashBackRate;
    }
    public void claimCashback(){
        double cashbackAmount = balance*cashBackRate;
        balance += cashbackAmount;
        System.out.println("you have claim RM"+cashbackAmount+" cashback!");
    }
}