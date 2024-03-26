package org.example.springlearning.controller;
import org.example.springlearning.model.Question;
import org.example.springlearning.model.QuestionWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.example.springlearning.service.QuizService;

import java.util.List;

@RestController
@RequestMapping("/quiz")
public class QuizController {

    @Autowired
    QuizService quizService;

    @PostMapping("/create")
    public ResponseEntity<String> createQuiz(@RequestParam String category, @RequestParam int questionCount, @RequestParam String title) {
        /*Here we will be using @RequestParam instead of @PathVariable because we are using POST method
        Pathvariable is used to bind the URI template variables to the method parameters where as RequestParam is used to bind the request parameters to the method parameters.
        RequestBody annotation is used to bind the HTTP request/response body with a domain object in method parameter or return type*/
        return quizService.createQuiz(category, questionCount, title);
    }

    @GetMapping("/getQuiz/{id}")
    public ResponseEntity<List<QuestionWrapper>> getQuiz(@PathVariable int id) {
       return quizService.getQuizQuestions(id);
    }
}
