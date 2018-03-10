package video1;
import java.util.*;

public class stackDemo {
	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<>();
		stack.push(0);
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.push(5);
		
		stack.pop();

		
for (Integer integer : stack) {
	System.out.println(integer);
}

		System.out.println(stack.search(2));
		
	}
}
