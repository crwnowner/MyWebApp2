package web.model;

import javax.persistence.*;
import javax.validation.constraints.*;

@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name")
    @NotEmpty(message = "Name should be between 2 and 25 latin characters")
    @Size(min = 2, max = 25)
    private String name;

    @Column(name = "surname")
    @NotEmpty(message = "Surname should be between 2 and 25 latin characters")
    @Size(min = 2, max = 25)
    private String surname;

    @Column(name = "age")
    @Min(value = 0, message = "Age should be >= 0")
    @Max(value = 127, message = "Age should be < 128")
    private int age;

    public User() {

    }

    public User(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String lastName) {
        this.surname = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return String.format("User {id = '%s', name = '%s', surname = '%s', age = '%d'}", getId(), getName(), getSurname(), getAge());
    }
}
