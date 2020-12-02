package models;

import jdk.jfr.Enabled;

import javax.persistence.*;

@Entity
@Table(name="question")
public class Question {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String text;
    private String score;
    private String active;

    public int getId() {
        return id;
    }

    public void setScore(String score) {
        this.score = score;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getScore() {
        return score;
    }



    public String getActive() {
        return active;
    }

    public void setActive(String active) {
        this.active = active;
    }

}
