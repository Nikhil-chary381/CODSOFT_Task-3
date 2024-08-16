import java.util.Scanner;
public class TASK_3 {
    float balance=0;
    public void deposit(float amount){
        balance+=amount;
        System.out.println("\t<--AMOUNT DEPOSITED SUCCESSFULLY-->\n");
    }
    public void withdraw(float amount){
        if(amount<=balance){
            balance-=amount;
            System.out.println("\t<--AMOUNT WITHDRAWN SUCCESSFULLY-->\n");
        }
        else{
            System.out.println("\tWITHDRAW FAILED\t<--ACCOUNT HAS INSUFFICIENT BALANCE-->\n");
        }
    }
    public void checkBalance(){
        System.out.println("\tACCOUNT BALANCE: "+balance);
    }
    public static void main(String[] args) {
        TASK_3 t=new TASK_3();
        Scanner sc=new Scanner(System.in);
        System.out.println();
        System.out.println("\t\t\t\t\t\t\t\t<-----WELCOME TO ATM INTERFACE----->");
        System.out.println("\t\t\t\t\t\t\t\t____________________________________");
        System.out.println();
        System.out.println("\tATM Operations:");
        System.out.println("\t______________");
        System.out.println();
        System.out.println("\t1.DEPOSIT\n\t2.WITHDRAW\n\t3.BALANCE ENQUIRY\n\t4.Exit\n");
        while(true){
            System.out.print("\tenter your choice: ");
            int choice=sc.nextInt();
            switch (choice) {
                case 1: System.out.print("\tenter amount to deposit: ");
                        int dep_amt=sc.nextInt();
                        t.deposit(dep_amt);
                        break;
                case 2: System.out.print("\tenter amount to withdraw: ");
                        int with_amt=sc.nextInt();
                        t.withdraw(with_amt);
                        break;
                case 3: t.checkBalance();
                        break;
                case 4: sc.close();
                        System.out.println("\t\t\t\t\t\t\t\t**Thank You**");
                        System.out.println("\t\t\t\t\t\t\t\t_____________");
                        System.out.println();
                        System.exit(0);
                default: System.out.println("\t**Please enter correct choice**");
                         continue;
                         
            }
        
        }
    }
}
