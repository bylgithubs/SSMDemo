package ssm.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import ssm.pojo.Books;

@Repository("BookMapper")
public interface BookMapper {
	int addBook(Books book);
	int deleteBookById(int id);
	int updateBook(Books books);
	Books queryBookById(int id);
	List<Books> queryAllBook();
}
