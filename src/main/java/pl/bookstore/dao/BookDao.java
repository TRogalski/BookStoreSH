package pl.bookstore.dao;

import org.springframework.stereotype.Repository;
import pl.bookstore.entity.Book;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

@Repository
@Transactional
public class BookDao {

    @PersistenceContext
    private EntityManager entityManager;

    public void saveBook(Book entity){
        entityManager.persist(entity);
    }
}
