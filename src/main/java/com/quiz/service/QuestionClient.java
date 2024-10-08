package com.quiz.service;

import com.quiz.entity.Question;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.*;

//@FeignClient(url="http://localhost:8082", value="Question-Client")
@FeignClient(url="QuestionService",value="Question-Client")
public interface QuestionClient {

    @GetMapping("/question/quiz/{quizId}")
    List<Question>getQuestionsOfQuiz(@PathVariable Long quizId);

}

