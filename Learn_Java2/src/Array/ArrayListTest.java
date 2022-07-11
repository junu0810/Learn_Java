package Array;

import java.util.ArrayList;



public class ArrayListTest {

	public static void main(String[] args) {
		
		ArrayList<Book> library = new ArrayList();
		
		Book [] library2 = new Book[2];
		library2[0] = new Book("태백산맥1", "조정래");
		library2[1] = new Book("태백산맥2", "조정래");
		// library2[2] = new Book("태백산맥3", "조정래");djq

		System.out.println(library2);

		library.add(new Book("태백산맥1", "조정래"));
		library.add(new Book("태백산맥2", "조정래"));
		library.add(new Book("태백산맥3", "조정래"));
		library.add(new Book("태백산맥4", "조정래"));
		library.add(new Book("태백산맥5", "조정래"));
		
		for(int i=0; i<library.size(); i++) {
			library.get(i).showInfo();
		}
		System.out.println("===book리스트===");
		for(Book book : library) {
			book.showInfo();
		}

	}

}
