package com.quiz.service;

import com.quiz.entity.Quiz;
import java.util.*;

public interface QuizService {

    Quiz add(Quiz quiz);
    List<Quiz>get();

    Quiz get(Long id);
}
