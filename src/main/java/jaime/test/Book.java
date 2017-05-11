package jaime.test;

public class Book {
	private int id;
	private Author author;
	
	public Book(int in)
	{
		id = in;
	}
	public void setId(int in)
	{
		id = in;
	}
	public int getId()
	{
		return id;
	}
	
	public Author getAuthor()
	{
		return new Author();
	}

}
