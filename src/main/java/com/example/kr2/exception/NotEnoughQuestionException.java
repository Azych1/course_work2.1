package com.example.kr2.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.BAD_REQUEST, reason = "Недостаточно вопросов в хранилище")
public class NotEnoughQuestionException extends RuntimeException {


}
