import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;
import java.util.TreeSet;
import java.util.concurrent.ArrayBlockingQueue;

public class Application {
	
	


	public static void main(String[] args)  {
		// TODO Auto-generated method stub

		
		//Employee employee=new Employee();
		//System.out.println(Employee.getEmployee());
		//Employee.segment="java-core";
		//System.out.println(Employee.code);
		
		//Manager manager=new Manager();
		
//		Employee employee=new Employee();
//		System.out.println(employee.xcode);
//		
//		employee.xcode="X0010";
//		
//		System.out.println(">>>>>>>>>>>");
//		
//		Employee employee1=(Employee) employee.clone();
//		System.out.println(employee1.xcode);
		
//		int x=0;long s=System.currentTimeMillis();
//		
//		
//		
//		List<Integer> list=new ArrayList<>();
//		
//		for(int Z=0;Z<10000000;Z++){
//			
//		for(int y=0;y<1000000000;y++){
//			
//			x=x+y;
//			//list.add(new Integer(x));
//			
//		}
//		
//		}
//		long e=System.currentTimeMillis();
//		
//		System.out.println("time: "+ (e-s));
//		
		
//		List <String> strings=new ArrayList();
//		
//		System.out.println(strings.size());
//		
//		
//		strings.add("A");
//		strings.add("G");
//		System.out.println(strings.size());
//		strings.add("Z");
//		strings.add("1");
//		System.out.println(strings.size());
//		
//		strings.remove(0);
//		System.out.println(strings.size());
		
		
//		Map <String,Integer> marks=new HashMap<>();
//		
//		marks.put("Saman", 89);
//		marks.put("Nimal", 94);
//		marks.put("Saman", 90);
//		marks.put("sunil", 44);
//		
//		for(Map.Entry<String, Integer> entry:marks.entrySet()){
//			
//		}
//		
		
		
//		Set <String> set=new TreeSet<>();
//		set.add("Z");
//		set.add("Q");
//		
//		set.add("E");
//		set.add("a");
//		set.add("R");
//		set.add("u");
//		System.out.println(set);
		
	
		
		Queue<String> queue=new LinkedList<>();
		queue.offer("A");
		queue.offer("1");
		
		queue.offer("Z");
		queue.offer("B");
		queue.offer("K");
		queue.offer("C");
		queue.offer("D");
		queue.offer("H");
		
		while(queue.peek()!=null){
			
			//System.out.println(queue.poll());
		}
		
		
		Stack <String> data=new Stack<>();
		
		
		data.push("A");
		data.push("1");
		
		data.push("Z");
		data.push("B");
		data.push("K");
		data.push("C");
		data.push("D");
		data.push("H");
		
		for(int i=0;i<data.size();i++){
			System.out.println(data.get(i));
		}
		
		
		
		
	}

}
