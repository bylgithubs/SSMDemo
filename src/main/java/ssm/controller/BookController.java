package ssm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import ssm.pojo.Books;
import ssm.service.BookService;

@Controller
//@RequestMapping("/book")
public class BookController {
	
	@Autowired
	@Qualifier("BookServiceImpl")
	private BookService bookService;
	
	@RequestMapping("/allBook")
	public String list(Model model) {
		List<Books> list = bookService.queryAllBook();
		//System.out.println(list);
		model.addAttribute("list", list);
		return "allBook";
	}
	
	@RequestMapping("/toAddBook")
	public String toAddPaper() {
		return "addBook";
	}
	
	@RequestMapping("/addBook")
	public String addPaper(Books books) {
		System.out.println(books);
		bookService.addBook(books);
		return "redirect:/allBook";
	}
	
	@RequestMapping("/toUpdateBook")
	public String toUpdateBook(Model model, int id) {
		Books books = bookService.queryBooksById(id);
		System.out.println(books);
		model.addAttribute("book", books);
		return "updateBook";
	}
	
	@RequestMapping("/updateBook")
	public String updateBook(Model model, Books book) {
		System.out.println(book);
		bookService.updateBook(book);
		Books books = bookService.queryBooksById(book.getBookID());
		model.addAttribute("books", books);
		return "redirect:/allBook";
	}
	
	@RequestMapping("/del/{bookId}")
	public String deleteBook(@PathVariable("bookId") int id) {
		bookService.deleteBookById(id);
		return "redirect:/allBook";
	}
}
