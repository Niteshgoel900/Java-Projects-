public class SavingsAccount {

    private double savingsBalance;
    private static double annualInterestRate;

    public SavingsAccount(double savingsBalance)
    {
        this.savingsBalance = savingsBalance;
    }

    public double getSavingsBal()
    {
        return savingsBalance;
    }

    public void setSavingsBal(double bal)
    {
        savingsBalance = bal;
    }

    public double getannualInterestRate()
    {
        return annualInterestRate;
    }

    public static void modifyInterestRate(double rate)
    {
        annualInterestRate = rate;
    }

    public double calculateMonthlyInterest(double bal, double rate)
    {
        return (bal * rate)/12;
    }

}