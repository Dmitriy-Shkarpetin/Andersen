package oop.polymorphism;

public class Book {
	private int pageCount;
	private int price;

	public int getPageCount() {
		return pageCount;
	}

	public void setPageCount(int pageCount) {
		this.pageCount = pageCount;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public Book(int pageCount, int price) {
		this.pageCount = pageCount;
		this.price = price;
	}

	public void Info(int pageCount, int price) {
		System.out.println("Прочитано " + pageCount + " страниц книги стоимостью " + price);
	}
}

