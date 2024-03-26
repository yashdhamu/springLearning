package org.example.springlearning.model;

import jakarta.persistence.*;
import lombok.Data;
import org.example.springlearning.model.Question;

import java.util.List;

@Data
@Entity
public class Quiz {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String title;
    private String category;
    @ManyToMany
    private List<Question> questions;
}
