package chap02.objectArray;

import java.util.Scanner;

/*
	책 제목과 저자를 담을 변수를 갖는 Book 클래스를 객체 배열로 만들고,
	사용자로부터 책의 제목과 저자를 입력받아 배열을 완성하시오.
*/  

class Book {
	String title, author;

	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}

	@Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author + "]";
	}
	
	
	
}


public class BookArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Book [] book = new Book[2];
		
		
		for (int i = 0; i < book.length; i++) {
			System.out.print("제목>>");
			String title = sc.nextLine();
			
			System.out.print("저자>>");
			String author = sc.nextLine();
			
			book[i] = new Book(title, author);
		}
		
		for (int i = 0; i < book.length; i++) {
			System.out.println(book[i]);
		}
		
	}
}
























