abstract class Loan
{
	void applyForLoan(){
		System.out.println("Apply For Loan");
	}
	abstract void emi();
	abstract void loanReport();
	/*void loanReport(){
		System.out.println("Loan Report Show");
	}*/
}
class AutoLoan extends Loan
{
	void allPassengersInsurance(){
		System.out.println("This AutoLoan Insurance...");
	}
	/*@Override
	void loanReport(){
		System.out.println("AutoLoan Report Show");
	}*/

	@Override
	void emi() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void loanReport() {
		// TODO Auto-generated method stub
		
	}
}
class HomeLoan extends Loan
{
	@Override
	void loanReport(){
		System.out.println("HomeLoan Report Show");
	}

	@Override
	void emi() {
		// TODO Auto-generated method stub
		
	}
}
class LoanPrint{
	//Upcasting
	void print(Loan loan){
		loan.applyForLoan();
		loan.loanReport();
		if(loan instanceof AutoLoan){
		AutoLoan al = (AutoLoan)loan; //Downcasting
		al.allPassengersInsurance();
		}
	}
}
public class UpCastingDownCasting {

	public static void main(String[] args) {
		
		LoanPrint pr = new LoanPrint();
		//pr.print(new Loan());
		pr.print(new HomeLoan());
		pr.print(new AutoLoan());
		/*Loan loan = new HomeLoan();
		loan.applyForLoan();
		loan.loanReport();
		
		loan = new AutoLoan();
		loan.applyForLoan();
		loan.loanReport();*/
		//loan.allPassengersInsurance();
		/*HomeLoan homeLoan = new HomeLoan();
		homeLoan.applyForLoan();
		homeLoan.loanReport();
		AutoLoan autoLoan = new AutoLoan();
		autoLoan.applyForLoan();
		autoLoan.loanReport();
		autoLoan.allPassengersInsurance();*/

	}

}
