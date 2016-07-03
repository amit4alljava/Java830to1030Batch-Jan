class Logic
{
	static int x = 1;
	public static void mylogic(){
		System.out.println("Account Info Starts..." + Thread.currentThread().getName());
		System.out.println("Follwing are the Account Info "+ Thread.currentThread().getName());
		//synchronized(this){
		System.out.println("Processing the Account WithDraw Process");
		for(int i = 1; i<=5 ; i++,x++){
			System.out.println("X is "+x+" I is "+i+" and Thread is "+Thread.currentThread().getName());
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("WithDraw Process Ends....");
	}
}
class Job implements Runnable{
int  x = 1;
Logic logic = new Logic();
	@Override
	public   void run() {
		//logic.someothermethod();
		//synchronized (logic) {
		//synchronized(Logic.class)	{
		//logic.mylogic();
		//Logic.mylogic();
		//}
		
		// TODO Auto-generated method stub
//		System.out.println("Account Info Starts..." + Thread.currentThread().getName());
//		System.out.println("Follwing are the Account Info "+ Thread.currentThread().getName());
//		//synchronized(this){
//		System.out.println("Processing the Account WithDraw Process");
		for(int i = 1; i<=5 ; i++,x++){
			System.out.println("X is "+x+" I is "+i+" and Thread is "+Thread.currentThread().getName()+" "+Thread.currentThread().isAlive());
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		//System.out.println("WithDraw Process Ends....");
//		//}
		
	}
	
}
public class Demo1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Job job1 = new Job();  // Create Job
		//Job job2 = new Job();
		//Job job3 = new Job();
		Thread worker = new Thread(job1,"ram");  // Create Worker and Assign the Job
		Thread worker2 = new Thread(job1,"shyam");
		Thread worker3 = new Thread(job1,"Mike");
		worker3.setDaemon(true);
		//worker3.setPriority(Thread.MAX_PRIORITY);
		//worker2.setPriority(Thread.MIN_PRIORITY);
		//worker.setPriority(Thread.NORM_PRIORITY);
		worker.start();  // start the job
		//worker.join();
		worker2.start();
		worker3.start();
		// start will call run
//		for(int i = 1; i<=5 ; i++){
//			System.out.println("MAIN :: I is "+i+" and Thread is "+Thread.currentThread().getName());
//		}
		

	}

}
