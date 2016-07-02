class Job implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i = 1; i<=5 ; i++){
			System.out.println("I is "+i+" and Thread is "+Thread.currentThread().getName());
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
}
public class Demo1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Job job1 = new Job();  // Create Job
		Job job2 = new Job();
		Job job3 = new Job();
		Thread worker = new Thread(job1,"ram");  // Create Worker and Assign the Job
		Thread worker2 = new Thread(job2,"shyam");
		Thread worker3 = new Thread(job3,"Mike");
		
		worker.start();  // start the job
		worker.join();
		worker2.start();
		worker3.start();
		// start will call run
		for(int i = 1; i<=5 ; i++){
			System.out.println("MAIN :: I is "+i+" and Thread is "+Thread.currentThread().getName());
		}
		

	}

}
