package pl.bookstore.entity;

import javax.persistence.*;

@Entity
@Table(name = "person_details")
public class PersonDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstName;
    private String lastName;
    private String streetNumber;
    private String street;
    private String city;

    public PersonDetails() {
    }

    public PersonDetails(String firstName, String lastName, String streetNumber, String street, String city) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.streetNumber = streetNumber;
        this.street = street;
        this.city = city;
    }

    @Override
    public String toString() {
        return "PersonDetails{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", streetNumber='" + streetNumber + '\'' +
                ", street='" + street + '\'' +
                ", city='" + city + '\'' +
                '}';
    }

    public Long getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getStreetNumber() {
        return streetNumber;
    }

    public void setStreetNumber(String streetNumber) {
        this.streetNumber = streetNumber;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
