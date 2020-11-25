package stackandqueue;

import java.util.LinkedList;
import java.util.Queue;

public class ParallelJoin {
//1357
//2468
//12345678	
	public static void main(String[] args) {
		Queue<Integer> odd = new LinkedList<Integer>();
		Queue<Integer> even = new LinkedList<Integer>();
		odd.add(1);
		odd.add(3);
		odd.add(5);
		odd.add(7);
		even.add(2);
		even.add(4);
		even.add(6);
		even.add(8);
		
		Queue<Integer> result = new LinkedList<Integer>();
		
		while(!odd.isEmpty()) {
			result.add(odd.poll());
			result.add(even.poll());
		}
		
		System.out.println(result);
	}
}
