package test1;

public class Printer extends Thread {

	
	static Thread parent;
	
	@Override
	public void run() {
		
//		try {
//			//parent.join();
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		for(int i=0;i<100;i++){
			System.out.println(i+" :"+ Thread.currentThread().getId());
			
		}
	
		
//		long s=System.currentTimeMillis();
//		
//			for(int i=0;i<5;i++){
//				System.out.println(i);
//				try {
//					Thread.sleep(2000);
//				
//			}
//				catch (InterruptedException e) {
//					System.out.println("Im interrupted");
//				}
//		} 
//			
//			
//			
//			
//		
//			long e=System.currentTimeMillis();
//			System.out.println(e-s);
		
	}
	
	
}
