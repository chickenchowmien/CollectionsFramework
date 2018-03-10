package video1;

import java.util.*;
import java.util.Map.Entry;

public class Maps {
public static void main(String[] args) {
	Map<Integer,String> student = new HashMap<>();
	
	student.put(3, "priyanka");
	student.put(1, "bob");
	student.put(2, "mia");
	
	
	
	for (Map.Entry<Integer, String> entry: student.entrySet()) {
		System.out.println(entry.getKey()+" is key\n"+entry.getValue()+" is the value");
		
		
	}
	System.out.println(student.get(3));
	
	for (Integer  element : student.keySet()) {
		System.out.println("keys "+ element );
	}
	
	
	Iterator<Entry<Integer,String>> entry = student.entrySet().iterator();
	
	while(entry.hasNext()) {
		System.out.println(entry.next());
		
		
		
		
	}
}
}
