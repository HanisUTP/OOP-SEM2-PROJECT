import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("enter your Name");
        String name = input.nextLine();
        System.out.println("enter your ID");
        String id = input.nextLine();
        System.out.println("enter your Maybank balance");
        double balance = input.nextDouble();
        Maybank wallet = new Maybank(balance);
        Mae mae = new Mae(balance,0);
        System.out.println("enter your deposit");
        double depo = input.nextDouble();
        wallet.deposit(depo);
        System.out.println("enter your withdraw amount");
        double withdraw = input.nextDouble();
        wallet.withdraw(withdraw);
        System.out.println("Maybank balance: RM"+wallet.getBalance());

        System.out.println("enter amount you want to deposit");
        double amount = input.nextDouble();
        mae.deposit(amount);
        mae.claimCashback();
        System.out.println("MAE wallet balance: RM "+mae.getBalance());

    }

}
