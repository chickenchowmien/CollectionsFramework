package video1;

import java.util.*;

class Names implements Comparable<Names> {
	private String lastName;
	private String firstName;

	public String getLastName() {
		return lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public Names(String lastName, String firstName) {
		this.lastName = lastName;
		this.firstName = firstName;
	}

	@Override
	public String toString() {
		return "Names [lastName=" + lastName + ", firstName=" + firstName + "]";
	}

	@Override
	public int compareTo(Names o) {

		return this.firstName.compareToIgnoreCase(o.firstName);
	}

}

public class SelfMadeDemo {
	public static void main(String[] args) {
		Comparator<Names> COMPARE_LASTNAME = new Comparator<Names>() {

			@Override
			public int compare(Names o1, Names o2) {
				return o1.getLastName().compareToIgnoreCase(o2.getLastName());

			}

		};
		List<Names> list = new ArrayList<Names>();
		list.add(new Names("lacson", "james"));
		list.add(new Names("stepanyan", "tamara"));
		list.add(new Names("a", "z"));
		Collections.sort(list);
		System.out.println(list);
		Collections.sort(list, COMPARE_LASTNAME);
		System.out.println(list);

	}
}
