package by.htp.arrlib.runner;

public class Book {

	private int year = 1995;
	
	public Book() {
		this(1996);
		System.out.println("Book constructor ()");
	}
	
	{
		year = 1962;
		System.out.println("Book logic block {}");
	}
	{
		year = 1997;
		System.out.println("Book logic block {}");
	}

	private Book(int year) {
		System.out.println("Book private constructor (int year)");
		this.year = year + 5;
	}
	
	
	
	public void setYear(int year) {
		this.year = year;
	}

	public int getYear() {
		return year;
	}

}
