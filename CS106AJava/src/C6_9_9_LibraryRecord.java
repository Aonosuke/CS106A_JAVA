/**
 * File:C6_9_9_LibraryRecord.java
 * ------------------------------
 * This class record the information of books.
 */

public class C6_9_9_LibraryRecord {
	
	/**
	 * Creates a new C6_9_9_LibraryRecord object with the specified 
	 * name, author, ID, publisher, publish year, circulated or not.
	 * @param name The book's name as a String
	 * @param author The book's author as a String
	 * @param id The book's ID number as an int
	 * @param publisher The book's publisher as a String
	 * @param year The book's publish year as an int
	 * @param circulation Weather the book is circulated
	 */
	public C6_9_9_LibraryRecord(String name, String author, int id, 
			String publisher, int year, boolean circulation) {
		this(name, author, id, publisher, year);
		bookCirculation = circulation;
	}
	
	public  C6_9_9_LibraryRecord(String name, String author, int id, 
			String publisher, int year) {
		bookName = name;
		bookAuthor = author;
		bookID = id;
		bookPublisher = publisher;
		bookYear = year;
		bookCirculation = true;
	}
	
	public String getName() {
		return bookName;
	}
	
	public String getAuthor() {
		return bookAuthor;
	}
	
	public int getID() {
		return bookID;
	}
	
	public String getPublisher() {
		return bookPublisher;
	}
	
	public int getYear() {
		return bookYear;
	}
	
	public void setCirculation(boolean star) {
		bookCirculation = star;
	}
	
	public boolean isCirculated() {
		return bookCirculation;
	}
	
	public String toString() {
		return bookName + " " + bookAuthor + " (SN." + bookID + ") " + 
		bookPublisher + " " + bookYear + 
		((bookCirculation == true) ? " Circulated " : " not Circulated ");
	}
	
	/* Private instance variables */
	
	private String bookName;			/* The book's name				*/
	private String bookAuthor;			/* The book's author			*/
	private int bookID;					/* The book's ID number			*/
	private String bookPublisher;		/* The book's publisher			*/
	private int bookYear;				/* The book's publish year		*/
	private boolean bookCirculation;	/* Weather book is circulated	*/

}
