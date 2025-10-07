
import java.util.Scanner;


class AtmSimulator{
    public static void main(String[] args) {
        Scanner amount=new Scanner(System.in);
         int balance=5000;
         System.out.println("WELCOME TO  ATM");
         System.out.println("1. DEPOSIT");
         System.out.println("2. WITHDRAW");
         int option=amount.nextInt();

         if(option==1){
            System.out.println("ENTER DEPOSIT AMOUNT : ");
            int DepositAmount=amount.nextInt();
            balance+=DepositAmount;
            System.out.println("Deposited Successfully!! Balance Amount :  "+balance);

         }
         else if(option==2){
            System.out.println("ENTER WITHDRAW AMOUNT :");
            int WithdrawAmount=amount.nextInt();
            if(WithdrawAmount<=balance){
                balance -= WithdrawAmount;
                System.out.println("Withdarw Successfully!! Balance Amount : "+balance);
            }
            else{
                System.out.println("Insufficient Balance!! Available Amount: "+balance);
            }
         }else{
            System.out.println("Invalid Option!! Please Enter the Correct Option!! Try Again!!");
         }
         
    }
}