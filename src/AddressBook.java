import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class AddressBook {
	Map<String, Set<Integer>> nameBook;
	Map<Integer, Set<String>> numberBook;
	
	public AddressBook() {
		nameBook = new HashMap<String, Set<Integer>>();
		numberBook = new HashMap<Integer, Set<String>>();
	}
	
	public void addAddress(String name, int... number) {
		Set<Integer> set = new HashSet<>();
		for(int i : number) {
			set.add(i);
		}
		nameBook.put(name, set);
	}
	
	public void addAddress(int number, String... name) {
		Set<String> set = new HashSet<>();
		for(String s : name) {
			set.add(s);
		}
		numberBook.put(number, set);
	}
	
	public void removeAdress(String name) {
		nameBook.remove(name);
	}
	
	public void removeAdress(int number) {
		nameBook.remove(number);
	}
	
	public String toString(String name) {
		String str = name + ": ";
		Set<Integer> set = nameBook.get(name);
		List<Integer> list = new ArrayList(set);
		Collections.sort(list);
		for(int i = 0; i < list.size(); i++) {
			if(i == list.size() - 1) {
				str += list.get(i);
			}else {
				str += list.get(i) + ", ";
			}
		}
		return str;
	}
	
	public String toString(int number) {
		String str = number + ": ";
		Set<String> set = numberBook.get(number);
		List<String> list = new ArrayList(set);
		Collections.sort(list);
		for(int i = 0; i < list.size(); i++) {
			if(i == list.size() - 1) {
				str += list.get(i);
			}else {
				str += list.get(i) + ", ";
			}
		}
		return str;
	}
}
