import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.Map;

public class AtnOperationImpl implements AtmOperationInterf{
    ATM atm=new ATM();
    Map<Double,String>ministmt=new HashMap<>();
    @Override
    public void viewBalance() {
        System.out.println("Avialable Balance is  :"+atm.getBalance());

    }

    @Override
    public void withdrawAmount(double withdrawAmount) {
        if (withdrawAmount % 500 == 0)

            if (withdrawAmount <= atm.getBalance()) {
                ministmt.put(withdrawAmount, "Amount withdrawn");
                System.out.println(" Collect the cash" + withdrawAmount);
                atm.setBalance(atm.getBalance() - withdrawAmount);
                viewBalance();
            } else {
                System.out.println("Insufficient Balance");
            }
        else {
            System.out.println("Please enter the amount above 500");
        }


    }

    @Override
    public void depositAmount(double depositAmount) {
        ministmt.put(depositAmount,"Amount deposited");
        System.out.println(depositAmount+"Deposited successfully");
        atm.setBalance(atm.getBalance()+depositAmount);
        viewBalance();

    }

    @Override
    public void viewMiniStatement() {
        for (Map.Entry<Double,String>ministmt : ministmt.entrySet()) {
            System.out.println(ministmt.getKey()+":"+ministmt.getValue());
        }

    }
}
