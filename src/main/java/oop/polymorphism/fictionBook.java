package oop.polymorphism;

public class fictionBook extends Book {
	private String genre;

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public fictionBook(int pageCount, int price, String genre) {
		super (pageCount, price);
		this.genre = genre;
	}

	public void Info(int pageCount, int price, int genre) {
		System.out.println("Прочитано " + pageCount + " страниц книги жанра " + genre + " стоимостью " + price);
	}
}