package org.example.springlearning.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

import java.util.List;

@Data // This means that Lombok will generate the getters, setters, equals, hash, and toString methods for us
@Entity // This tells Hibernate to make a table out of this class
public class Question {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) // This means to generate the value of id automatically
    private Integer id;
    private String questionTitle;
    private String option1;
    private String option2;
    private String option3;
    private String option4;
    private String difficultyLevel;
    private String rightAnswer;
    private String category;

    public List<Question> getAllQuestion() {
        return null;
    }
}
