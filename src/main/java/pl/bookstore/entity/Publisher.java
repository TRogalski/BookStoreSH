package pl.bookstore.entity;

import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import java.util.*;

@Entity
@Table(name="publishers")
public class Publisher {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    @Override
    public String toString() {
        return "Publisher{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public Publisher() {
    }

    public Long getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}
