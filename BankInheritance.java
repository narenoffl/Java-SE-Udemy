class Account {

    private long AccNo;
    private String Name;
    private double OpenBal;

    public long getAccNo() {
        return AccNo;
    }

    public String getName() {
        return Name;
    }

    public double getOpenBal() {
        return OpenBal;
    }

    public void setAccNo(long a) {
        AccNo = a;
    }

    public void setName(String n) {
        Name = n;
    }

    public void setOpenBal(double b) {
        OpenBal = b;
    }

    public Account(long Ac, String N) {
        AccNo = Ac;
        Name = N;
    }

    public Account() {
    }

    public void Close() {

        System.out.println("Account has been closed & the funds have been transferred successfully.");
    }

}

class savingsAccount extends Account {

    public double deposit(double add) {
        return getOpenBal() + add;

    }

    public double Withdrawal(double minus) {
        return getOpenBal() - minus;
    }

    public savingsAccount(long Ac, String N) {
        super(Ac, N);
    }

}

public class BankInheritance {

    public static void main(String[] args) {

        savingsAccount Acc = new savingsAccount(800123456001L, "Naren Purushothaman");
        Acc.setOpenBal(200);
        System.out.format(
                "Account has been opened for the Customer %s with Account number as %d & opening balance as %.2f. ",
                Acc.getName(), Acc.getAccNo(), Acc.getOpenBal());
        System.out.println("\nThe Current funds after the cash deposit is: " + Acc.deposit(250));
        System.out.println("The Current funds after the cash withdrawal is: " + Acc.Withdrawal(50));
        Acc.Close();
    }

}