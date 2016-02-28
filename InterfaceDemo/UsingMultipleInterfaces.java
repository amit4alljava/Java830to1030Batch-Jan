interface Payroll{
	void salaryCompute();  // public abstract void show();
	void hraCompute();
	void bonusCompute();
}
interface Performance
{
	void attendenceCheck();
	void taskCompleted();
}
class ITEmployee implements Payroll,Performance{

	@Override
	public void attendenceCheck() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void taskCompleted() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void salaryCompute() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void hraCompute() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void bonusCompute() {
		// TODO Auto-generated method stub
		
	}
	
}
class HREmployee implements Payroll,Performance{

	@Override
	public void attendenceCheck() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void taskCompleted() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void salaryCompute() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void hraCompute() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void bonusCompute() {
		// TODO Auto-generated method stub
		
	}

}

public class UsingMultipleInterfaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
