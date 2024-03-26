package org.example.springlearning.controller;

import org.example.springlearning.model.Question;
import org.example.springlearning.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController // This means that this class is a Controller meaning it will handle HTTP requests
@RequestMapping ("/question") // This means URL's start with /questions after Application path
public class QuestionController {
    @Autowired
    QuestionService questionService;
    @GetMapping("/allQuestions") // This means URL's start with /questions/getQuestion after Application path
    public ResponseEntity<List<Question>> getAllQuestion() {
        return questionService.getAllQuestion();
    }

    @GetMapping("/category/{category}") // This means URL's start with /questions/getQuestionByCategory after Application path
    public ResponseEntity<List<Question>> getQuestionByCategory(@PathVariable String category) {
        return questionService.getQuestionByCategory(category);
    }

    @PostMapping("/addQuestion") // This means URL's start with /questions/addQuestion after Application path
    public ResponseEntity<String> addQuestion(@RequestBody Question question) { // RequestBody annotation is used to bind the HTTP request/response body with a domain object in method parameter or return type
        return questionService.addQuestion(question);
    }

    @DeleteMapping("/deleteQuestion/{id}") // This means URL's start with /questions/deleteQuestion after Application path
    public ResponseEntity<String> deleteQuestion(@PathVariable int id) {
        return questionService.deleteQuestion(id);
    }
}
