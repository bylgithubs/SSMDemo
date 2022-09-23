package ssm.service;

import java.util.List;

import ssm.pojo.Books;

public interface BookService {
	
	int addBook(Books book);
	int deleteBookById(int id);
	int updateBook(Books books);
	Books queryBooksById(int id);
	List<Books> queryAllBook();
}
