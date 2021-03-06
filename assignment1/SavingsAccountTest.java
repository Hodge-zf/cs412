public class SavingsAccountTest{

  public static void main(String[] args){

    final double newInterestRate = 2;

    SavingsAccount customer1 = new SavingsAccount(1.03, 3000);
    SavingsAccount customer2 = new SavingsAccount(1.03, 5000);

    customer1.calculateMonthlyInterest();
    customer2.calculateMonthlyInterest();
  }
}
