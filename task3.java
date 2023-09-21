import java.util.Scanner;

public class atm_machine{
    public static void main(String[] args) {
        System.out.println("Welcome to ATM Machine\nInsert your card below to continue");
        System.out.print("Enter 4 digit PIN:- ");
        Scanner sc=new Scanner(System.in);
        int ano=sc.nextInt();
        int bal=0;
        while(true){
            System.out.println("1.WITHDRAW         2.DEPOSIT");
            System.out.println("3.CHECK BALANCE    4.EXIT");
            System.out.print("enter your choice:- ");
            int op=sc.nextInt();
            switch(op){
                case 1:
                System.out.print("Enter Amount:- ");
                int wd=sc.nextInt();
                if(bal>=wd){
                    bal=bal-wd;
                    System.out.println("Please collect the money");
                }
                else{
                    System.out.println("Insufficient balance");
                }
                System.out.println("");
                break;

                case 2:
                System.out.print("Enter amount to be deposited:- ");
                int depo=sc.nextInt();
                bal=bal+depo;
                System.out.println("Amount successfully deposited");
                System.out.println(" ");
                break;

                case 3:
                System.out.print("Your balance:- "+bal);
                System.out.println("");
                break;

                case 4:
                System.out.println("Thank you! Please visit again.");
                System.exit(0);
            }
            

        }
    }
}
