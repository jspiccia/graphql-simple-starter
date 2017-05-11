package jaime.test;

import com.coxautodev.graphql.tools.GraphQLRootResolver;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class Query implements GraphQLRootResolver {


    public Book book(String id) {
       return new Book(Integer.parseInt(id));
    }
    
    public List<Book> findAll()
    {
    	return Arrays.asList(new Book(2));
    }
    
    public int getId()
    {
    	return -1;
    }

}
