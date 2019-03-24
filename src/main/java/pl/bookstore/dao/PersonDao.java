package pl.bookstore.dao;

import org.springframework.stereotype.Repository;
import pl.bookstore.entity.Person;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public class PersonDao {

    @PersistenceContext
    private EntityManager entityManager;

    public void save(Person person) {
        entityManager.persist(person);
    }

    public Person findById(long id) {
        return entityManager.find(Person.class, id);
    }

    public void update(Person person) {
        entityManager.merge(person);
    }

    public void delete(Person person) {
        entityManager.remove(entityManager.contains(person) ? person : entityManager.merge(person));
    }

    public List<Person> findAll() {
        Query query = entityManager.createQuery("SELECT P FROM Person P");
        return query.getResultList();
    }
}
