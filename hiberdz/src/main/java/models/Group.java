package models;

import javax.persistence.*;

@Entity
@Table(name="group")
public class Group {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;
    private int year;
    private String semester;

    public int getId() {
        return id;
    }


    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getSemester() {
        return semester;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    @Override
    public String toString() {
        return "Group{" + "id=" + id + ", name=" + name + ", year=" + year + ", semester=" + semester + '}';
    }
}
