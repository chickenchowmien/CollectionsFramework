package video1;
import java.util.*;
public class LinkedListDemo {
	public static void main(String[] args) {
		LinkedList<String> countries = new LinkedList<>();
		addInOrder(countries, "india");
		addInOrder(countries, "usa");
		addInOrder(countries, "russia");
		addInOrder(countries, "zimbabwe");
		addInOrder(countries, "argentina");


		new LinkedListDemo().printList(countries);
		visit(countries);

	}
	void printList(LinkedList<String> list) {
		Iterator<String> i = list.iterator();
		while(i.hasNext()) {
			System.out.println("countries: "+ i.next());
		}
		System.out.println("-------------------------");
	}
	
	private static boolean addInOrder(LinkedList<String> list, String newCity) {
		ListIterator<String> listIterator= list.listIterator();
		while(listIterator.hasNext()) {
			int comparison = listIterator.next().compareTo(newCity);
			if (comparison==0) {
				System.out.println(newCity+" is already included");
				return false;
			}else if(comparison>0) {
				//new city should appear before
				listIterator.previous();
				listIterator.add(newCity);	
				return true;
			}else if(comparison<0) {
				//move on to next city
				
			}
			
		}
		listIterator.add(newCity);
		return true;
	}
	
	private static void visit(LinkedList cities) {
		Scanner scanner = new Scanner(System.in);
		boolean quit = false;
		boolean forward = true;
		ListIterator<String> listIterator=cities.listIterator();
		
		if(cities.isEmpty()) {
			System.out.println("no cities");
		}else {
			System.out.println("now visiting: "+listIterator.next());
			
		}
		
		while(!quit) {
			int action = scanner.nextInt();
			scanner.nextLine();
			switch(action) {
			case 0:
				System.out.println("holiday over");
				quit=true;
				break;
			case 1:
				if(!forward) {
					if(listIterator.hasNext()) {
						listIterator.next();
					}
					forward =true;
				}
				if(listIterator.hasNext()) {
					System.out.println("now visiting: "+ listIterator.next());
				}	else {
					System.out.println("reached the end of the list");
					forward=false;
				}
				break;	
			case 2:
				if(forward) {
					if(listIterator.hasPrevious()) {
						listIterator.previous();
					}
					forward=false;
				}
				if(listIterator.hasPrevious()) {
					System.out.println("now visiting: "+ listIterator.previous());
				}
				else {
					System.out.println("we are at the start of the list");
					forward=true;
				}
				quit=true;
				break;
			case 3:
				printMenu();
				break;
				
			}
		}
	}
	
	private static void printMenu() {
		System.out.println("avalable actions: \n press ");
		System.out.println("0- to quit \n "+
				"1-go to next city\n"+
				"2-go to previous city\n"+
				"3-print menu options\n"
				);
	}
}



