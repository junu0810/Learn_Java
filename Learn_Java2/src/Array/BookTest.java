package Array;

public class BookTest {

	public static void main(String[] args) {
		
		Book[] library = new Book[5];
		Book[] copyLibrary = new Book[5];
//		for(int i=0; i<library.length; i++) {
//			System.out.println(library[i]);
//		}
		
		library[0] = new Book("태백산맥1","조정래");
		library[1] = new Book("태백산맥2","조정래");
		library[2] = new Book("태백산맥3","조정래");
		library[3] = new Book("태백산맥4","조정래");
		library[4] = new Book("태백산맥5","조정래");
		
		//copy 라이브러리
		System.arraycopy(library, 0, copyLibrary,0,5);
		System.out.println("==Library==");
		
		for(Book book : library) {
			//System.out.println(book);
			book.showInfo();
		}
		
		//얕은 복사가 상 영향이간다.
		library[1].setAuthor("베르나르베르베르");
		library[1].setTitle("나무");
		
		System.out.println("==copyLibrary==");
		
		for(Book book : copyLibrary) {
			//System.out.println(book);
			book.showInfo();
		}
		
		//DeepCopy 하기
		Book[] deepLibrary = new Book[5];
		deepLibrary[0] = new Book("태백산맥1","조정래");
		deepLibrary[1] = new Book("태백산맥2","조정래");
		deepLibrary[2] = new Book("태백산맥3","조정래");
		deepLibrary[3] = new Book("태백산맥4","조정래");
		deepLibrary[4] = new Book("태백산맥5","조정래");
		//원래 배열에 영향을 준
		
		deepLibrary[2].setAuthor("베르나르베르베르");
		deepLibrary[2].setTitle("인간");
		System.out.println("==deepLibrary==");
		for(Book book : deepLibrary) {
			//System.out.println(book);
			book.showInfo();
		}
	}

}
