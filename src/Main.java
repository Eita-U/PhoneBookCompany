
public class Main {

	public static void main(String[] args) {
		AddressBook book = new AddressBook();
		
		book.addAddress("Alexander", 4, 1, 2, 3);
		book.addAddress("Bella", 7, 5, 6);
		book.addAddress("Ben", 9, 8);
		book.addAddress("Alice", 0);
		
		book.addAddress(1, "David", "Alexander", "Brandon", "Caleb");
		book.addAddress(5, "Chloe", "Aria", "Bella");
		book.addAddress(8, "Ben", "Adam");
		book.addAddress(0, "Alice");
		
		System.out.println(book.toString("Alexander"));
		System.out.println(book.toString("Bella"));
		System.out.println(book.toString("Ben"));
		System.out.println(book.toString("Alice"));
		
		System.out.println(book.toString(1));
		System.out.println(book.toString(5));
		System.out.println(book.toString(8));
		System.out.println(book.toString(0));
	}

}
