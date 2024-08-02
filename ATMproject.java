import java.sql.SQLOutput;
import java.util.Scanner;

public class ATMproject {
    public static void main(String[] args) {
        AtmOperationInterf op=new AtnOperationImpl();
        int atmNumber;
        int atmPin;
        atmNumber = 12345;
        atmPin = 123;
        Scanner in = new Scanner(System.in);
        System.out.println(" welcome ");
        System.out.println("Enter ATM Number : ");
        atmNumber = in.nextInt();
        System.out.println("Enter ATM pin : ");
        int pin= in.nextInt();
        if((atmNumber == atmNumber)&&(atmPin==pin)){
            while (true){
                System.out.println("1.View Available Balance\n2.Withdraw Amount\n3.Deposite Amount\n4.View Ministatement\n5.Exit");
                System.out.println("Enter Choice : ");
                int ch=in.nextInt();
                if (ch==1){
                    op.viewBalance();

                } else if (ch==2) {
                    System.out.println("Enter Amount Withdraw: ");
                    double withdraw=in.nextDouble();
                    op.withdrawAmount(withdraw);

                } else if (ch==3) {
                    System.out.println("Enter Amout to Deposite");
                    double depositeAmount=in.nextDouble();
                    op.depositAmount(depositeAmount);


                } else if (ch==4) {
                    op.viewMiniStatement();

                } else if (ch==5) {
                    System.out.println("Collect the ATM card \n Thank you");
                    System.exit(0);
                }
                else {
                    System.out.println("please enter correct choice");
                }
            }



        }
        else{
            System.out.println("Incorrect AtmNumber or AtmPin");
            System.exit(0);
        }

    }
}
