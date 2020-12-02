package models;

import javax.persistence.*;

@Entity
@Table(name = "studentanswer")
public class StudentAnswer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private Test test;
    private User user;
    private Answer answer;

    public int getId() {
        return id;
    }

    public Test getTest() {
        return test;
    }
    public Answer getAnswer() {
        return answer;
    }

    public void setAnswer(Answer answer) {
        this.answer = answer;
    }

    public void setTest(Test test) {
        this.test = test;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }



}
