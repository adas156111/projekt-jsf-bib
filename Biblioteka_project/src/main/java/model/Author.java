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
@Table(name = "Authors")
@SequenceGenerator(name = "seq", sequenceName = "seq_author")
public class Author {
	
	@Id
	@GeneratedValue(generator="seq",strategy=GenerationType.IDENTITY)
	@Column(name = "id_author", unique = true)
	private Long id;
	@Column(length = 50, nullable = false)
	private String first_name;
	@Column(length = 50, nullable = false)
	private String name;
	@OneToMany(mappedBy = "pk.authors", fetch = FetchType.LAZY)
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
	 * @return the first_name
	 */
	public String getFirst_name() {
		return first_name;
	}
	/**
	 * @param first_name the first_name to set
	 */
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
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
