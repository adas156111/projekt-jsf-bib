package model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "Books")
@SequenceGenerator(name = "seq", sequenceName = "seq_books")
public class Book {
	
	@Id
	@GeneratedValue(generator = "seq", strategy = GenerationType.IDENTITY)
	@Column(nullable = false, unique = true)
	private Long id;
	@Column(length = 255, nullable = false)
	private String title;
	@Column(length = 255, nullable = false)
	private String describe;
	@Column(nullable = false)
	private boolean active;
	@OneToMany(mappedBy = "", fetch = FetchType.LAZY)
	private List<BooksAuthors> booksAuthors;
	
	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}
	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	/**
	 * @return the describe
	 */
	public String getDescribe() {
		return describe;
	}
	/**
	 * @param describe the describe to set
	 */
	public void setDescribe(String describe) {
		this.describe = describe;
	}
	/**
	 * @return the active
	 */
	public boolean isActive() {
		return active;
	}
	/**
	 * @param active the active to set
	 */
	public void setActive(boolean active) {
		this.active = active;
	}
	/**
	 * @return the booksAuthors
	 */
	public List<BooksAuthors> getBooksAuthors() {
		return booksAuthors;
	}
	/**
	 * @param booksAuthors the booksAuthors to set
	 */
	public void setBooksAuthors(List<BooksAuthors> booksAuthors) {
		this.booksAuthors = booksAuthors;
	}
}
