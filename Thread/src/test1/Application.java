package test1;

public class Application {

	public static void main(String[] args) throws InterruptedException {
		
		Printer printer=new Printer();
		//printer.setDaemon(true);
		
		printer.start();
		Printer.parent=Thread.currentThread();
		printer.join();
		for(int i=0;i<10;i++)
		{
			
			System.out.println("B:"+i+" ->"+Thread.currentThread().getId());
		}
		
		
//		Printer printer=new Printer();
//		printer.start();
//		printer.interrupt();
//		printer.interrupt();
//		
		
		
				
	}

}
