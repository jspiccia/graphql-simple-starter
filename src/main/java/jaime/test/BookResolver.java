package jaime.test;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLResolver;

@Component
class BookResolver implements GraphQLResolver<Book> {
	
	public String getTheAuthor(Book book)
	{
		return "the author" + book.getId();
	}
	
	// example overriding the property from the pojo
	public int getId(Book book)
	{
		return book.getId()+1000;
	}
	
	public List<Book> related(Book booke)
	{
		return Arrays.asList(new Book(3));
	}
	
	public List<Book> other(Book booke)
	{
		return Arrays.asList(new Book(3));
	}

}
