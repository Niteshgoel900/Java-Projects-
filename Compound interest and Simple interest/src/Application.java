
public class Application {
    public static void main(String[] args) {
        int i;
        double x;
        SavingsAccount saver1 = new SavingsAccount(2000);
        SavingsAccount saver2 = new SavingsAccount(3000);

        SavingsAccount.modifyInterestRate(0.04);
        System.out.println("SAVER 1:");
        for(i = 0; i < 12; i++)
        {
            x = saver1.calculateMonthlyInterest(saver1.getSavingsBal(), saver1.getannualInterestRate());
            saver1.setSavingsBal(saver1.getSavingsBal() + x);
            System.out.printf("The balance for month %d: $%.2f\n", i+1, saver1.getSavingsBal());
        }
        System.out.println("\nSAVER 2:");
        for(i = 0; i < 12; i++)
        {
            x = saver2.calculateMonthlyInterest(saver2.getSavingsBal(), saver2.getannualInterestRate());
            saver2.setSavingsBal(saver2.getSavingsBal() + x);
            System.out.printf("The balance for month %d: $%.2f\n", i+1, saver2.getSavingsBal());
        }

        SavingsAccount.modifyInterestRate(0.05);

        System.out.println("\nSAVER 1:");
        x = saver1.calculateMonthlyInterest(saver1.getSavingsBal(), saver1.getannualInterestRate());
        saver1.setSavingsBal(saver1.getSavingsBal() + x);
        System.out.printf("The balance for month %d: $%.2f\n", i+1, saver1.getSavingsBal());

        System.out.println("SAVER 2:");
        x = saver2.calculateMonthlyInterest(saver2.getSavingsBal(), saver2.getannualInterestRate());
        saver2.setSavingsBal(saver2.getSavingsBal() + x);
        System.out.printf("The balance for month %d: $%.2f\n", i+1, saver2.getSavingsBal());

    }

}