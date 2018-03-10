package video1;
import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.LinkedBlockingQueue;
public class QueueDemo {
public static void main(String[] args) {
	Deque<Integer> deque = new LinkedBlockingDeque<>();
	
	deque.add(1);
	deque.add(2);
	deque.add(3);
	deque.add(4);
	deque.add(5);
	
	for (Integer integer : deque) {
		System.out.println(integer);
	}
}
}
