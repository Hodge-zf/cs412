public class Pieceworker extends Employee{

  private double piecesProduced;
  private double employeeWage;

  public Pieceworker(String first, String last, String ssn, double pieces, double wage){

    super(first, last, ssn);
    setPiecesProduced(pieces);
    setEmployeeWage(wage);
  }

  public void setEmployeeWage(double wage){
    employeeWage = wage;
  }

  public double getEmployeeWage(){
    return employeeWage;
  }

  public void setPiecesProduced(double pieces){
    piecesProduced = pieces;
  }

  public double getPiecesProduced(){
    return piecesProduced;
  }

  @Override
  public double earnings(){
    return getEmployeeWage() * getPiecesProduced();
  }
}
