package pl.bookstore.dao;

import org.springframework.stereotype.Repository;
import pl.bookstore.entity.PersonDetails;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public class PersonDetailsDao {

    @PersistenceContext
    private EntityManager entityManager;

    public void save(PersonDetails personDetails) {
        entityManager.persist(personDetails);
    }

    public PersonDetails findById(long id) {
        return entityManager.find(PersonDetails.class, id);
    }

    public void update(PersonDetails personDetails) {
        entityManager.merge(personDetails);
    }

    public void delete(PersonDetails personDetails) {
        entityManager.remove(entityManager.contains(personDetails) ? personDetails : entityManager.merge(personDetails));
    }

    public List<PersonDetails> findAll() {
        Query query = entityManager.createQuery("SELECT P FROM PersonDetails P");
        return query.getResultList();
    }
}
