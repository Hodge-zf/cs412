public class SavingsAccount{

    static double annualInterestRate;
    static double newInterestRate;
    private double savingsBalance;

    public SavingsAccount(double annualInterestRate, double savingsBalance){
      this.annualInterestRate = annualInterestRate;
      this.savingsBalance = savingsBalance;
    }

/*    public double getAnnualInterestRate{
      return annualInterestRate;
    }

    public double getSavingsBalance{
      return savingsBalance;
    }

    public void setAnnualInterestRate{
      this.
    }*/

    public double calculateMonthlyInterest(){

      savingsBalance = savingsBalance * (annualInterestRate/12);
      System.out.println(savingsBalance);
      return savingsBalance;
    }

    public static double modifyInterestRate(){

      annualInterestRate = newInterestRate;
      return annualInterestRate;
    }


}
