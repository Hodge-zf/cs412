public class SavingsAccountTest{

  public static void main(String[] args){

    final double newInterestRate = 2;

    SavingsAccount customer1 = new SavingsAccount(1.03, 3000);
    SavingsAccount customer2 = new SavingsAccount(1.03, 5000);

    System.out.println("Customer1: ");
    customer1.calculateMonthlyInterest();
    System.out.println();

    System.out.println("Customer2: ");
    customer2.calculateMonthlyInterest();
    System.out.println();

    customer1.modifyInterestRate(newInterestRate);
    customer2.modifyInterestRate(newInterestRate);

    System.out.println("Customer1: ");
    customer1.calculateMonthlyInterest();
    System.out.println();

    System.out.println("Customer2: ");
    customer2.calculateMonthlyInterest();
    System.out.println();
  }
}
