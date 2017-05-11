package jaime.test;

import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLResolver;

@Component
class BookResolver implements GraphQLResolver<Book> {
	
	public String getAuthor(Book book)
	{
		return "the author";
	}
	
	// example overriding the property from the pojo
	public int getId(Book book)
	{
		return -1;
	}

}
