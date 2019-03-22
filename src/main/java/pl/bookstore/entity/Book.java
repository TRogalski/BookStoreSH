package pl.bookstore.entity;

import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "books")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(length = 100, nullable = false)
    private String title;
    @Column(scale = 2, precision = 4)
    private BigDecimal rating;
    @Column(columnDefinition = "TEXT")
    private String description;

    public Book() {
    }

    @ManyToOne(fetch = FetchType.EAGER, cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    private Publisher publisher;

    @JoinTable(
            joinColumns = @JoinColumn(
                    name = "id_book",
                    referencedColumnName = "id"
            ),
            inverseJoinColumns = @JoinColumn(
                    name = "id_author",
                    referencedColumnName = "id"
            )
    )

    @ManyToMany(fetch = FetchType.EAGER, cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    private Set<Author> authors = new HashSet<>();

    @Override
    public String toString() {
        return "Book{" +
                ", title='" + title + '\'' +
                ", rating=" + rating +
                ", description='" + description + '\'' +
                '}';
    }

    public Publisher getPublisher() {
        return publisher;
    }

    public void setPublisher(Publisher publisher) {
        this.publisher = publisher;
    }

    public Set<Author> getAuthors() {
        return authors;
    }

    public void setAuthors(Set<Author> authors) {
        this.authors = authors;
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public BigDecimal getRating() {
        return rating;
    }

    public void setRating(BigDecimal rating) {
        this.rating = rating;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
