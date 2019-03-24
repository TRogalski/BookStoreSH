package pl.bookstore.entity;

import java.util.List;

public class Student {

    private String firstName;
    private String lastName;
    private String gender;
    private String country;
    private String notes;
    private Boolean mailingList;
    private List<String> programmingSkills;
    private List<String> hobbies;

    public Student() {
    }

    public Student(String firstName, String lastName, String gender, String country, String notes, Boolean mailingList, List<String> programmingSkills, List<String> hobbies) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.country = country;
        this.notes = notes;
        this.mailingList = mailingList;
        this.programmingSkills = programmingSkills;
        this.hobbies = hobbies;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", gender='" + gender + '\'' +
                ", country='" + country + '\'' +
                ", notes='" + notes + '\'' +
                ", mailingList=" + mailingList +
                ", programmingSkills=" + programmingSkills +
                ", hobbies=" + hobbies +
                '}';
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public Boolean getMailingList() {
        return mailingList;
    }

    public void setMailingList(Boolean mailingList) {
        this.mailingList = mailingList;
    }

    public List<String> getProgrammingSkills() {
        return programmingSkills;
    }

    public void setProgrammingSkills(List<String> programmingSkills) {
        this.programmingSkills = programmingSkills;
    }

    public List<String> getHobbies() {
        return hobbies;
    }

    public void setHobbies(List<String> hobbies) {
        this.hobbies = hobbies;
    }
}
