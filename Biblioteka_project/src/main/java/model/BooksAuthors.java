package model;

import javax.persistence.AssociationOverride;
import javax.persistence.AssociationOverrides;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "BooksAuthors")
@SequenceGenerator(name = "seq", sequenceName = "seq_booksauthors")
public class BooksAuthors {

	@Id
	@GeneratedValue(generator = "seq", strategy = GenerationType.IDENTITY)
	@Column(name = "id_booksauthors")
	private Long id;
	@OneToOne(mappedBy = "BooksAuthors")
	private User user;
	@OneToOne(mappedBy = "BooksAuthors")
	private Book book;
}
