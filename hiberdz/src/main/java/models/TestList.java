package models;

import javax.persistence.*;

@Entity
@Table(name = "testlist")
public class TestList {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private User teacher;
    private Subject subject;

}
