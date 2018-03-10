package video1;

import java.util.*;

class Data<K, V> {
	private K key;
	private V value;

	public K getKey() {
		return key;
	}

	public void setKey(K key) {
		this.key = key;
	}

	public V getValue() {
		return value;
	}

	public void setValue(V value) {
		this.value = value;
	}

	public Data(K key, V value) {
		super();
		this.key = key;
		this.value = value;
	}

	@Override
	public String toString() {
		return "Data [key=" + key + ", value=" + value + "]";
	}

}

public class ComparatorDemo {
	public static void main(String[] args) {
		Comparator<Data<Integer, String>> COMPARE_KEY = new Comparator<Data<Integer, String>>() {

			@Override
			public int compare(Data<Integer, String> o1, Data<Integer, String> o2) {
				if (o1.getKey() < o2.getKey())
					return -1;
				else if (o1.getKey() > o2.getKey())
					return 1;
				else
					return 0;
			}

		};

		Comparator<Data<Integer, String>> COMPARE_NAME = new Comparator<Data<Integer, String>>() {

			@Override
			public int compare(Data<Integer, String> o1, Data<Integer, String> o2) {
				if (o1.getValue().length() < o2.getValue().length())
					return -1;
				else if (o1.getValue().length() > o2.getValue().length())
					return 1;
				else
					return 0;
			}

		};

		Set<Data<Integer, String>> set = new TreeSet<>(COMPARE_NAME);
		set.add(new Data<Integer, String>(9, "nine"));
		set.add(new Data<Integer, String>(1, "one"));
		set.add(new Data<Integer, String>(2, "two"));
		set.add(new Data<Integer, String>(3, "three"));
		for (Data data : set) {
			System.out.println(data);
		}
	}
}
