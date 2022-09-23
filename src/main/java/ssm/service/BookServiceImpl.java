package ssm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import ssm.dao.BookMapper;
import ssm.pojo.Books;

public class BookServiceImpl implements BookService {
	
	@Autowired
	private BookMapper bookMapper;
	
	public void setBookMapper(BookMapper bookMapper) {
		this.bookMapper = bookMapper;
	}

	@Override
	public int addBook(Books book) {
		// TODO Auto-generated method stub
		return bookMapper.addBook(book);
	}

	@Override
	public int deleteBookById(int id) {
		// TODO Auto-generated method stub
		return bookMapper.deleteBookById(id);
	}

	@Override
	public int updateBook(Books books) {
		// TODO Auto-generated method stub
		return bookMapper.updateBook(books);
	}

	@Override
	public Books queryBooksById(int id) {
		// TODO Auto-generated method stub
		return bookMapper.queryBookById(id);
	}

	@Override
	public List<Books> queryAllBook() {
		// TODO Auto-generated method stub
		return bookMapper.queryAllBook();
	}

}
