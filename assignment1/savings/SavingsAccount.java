public class SavingsAccount{

    static double annualInterestRate;
    static double newInterestRate;
    private double savingsBalance;
    private double monthlyInterest;

    public SavingsAccount(double annualInterestRate, double savingsBalance){
      this.annualInterestRate = annualInterestRate;
      this.savingsBalance = savingsBalance;
    }

    public double calculateMonthlyInterest(){

      monthlyInterest = savingsBalance * (annualInterestRate/12);
      savingsBalance = savingsBalance + monthlyInterest;
      System.out.println("Interest: "+monthlyInterest);
      System.out.println("New Balance: "+savingsBalance);
      return monthlyInterest;
    }

    public static double modifyInterestRate(double newInterestRate){

      annualInterestRate = newInterestRate;
      return annualInterestRate;
    }


}
