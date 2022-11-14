package br.com.convergencia.cpf.utils;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.LocalDateTime;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

@ControllerAdvice
public class ExceptionHandlerController {

    // {
    //     "timestamp": "2022-11-14T19:06:45.184+00:00",
    //     "status": 400,
    //     "error": "Bad Request",
    //     "path": "/pessoas/3"
    // }
    @ExceptionHandler({Exception.class, RuntimeException.class})
    public ResponseEntity handleError(HttpServletRequest req, Exception ex) {
        System.out.println(req.getRequestURL());
        System.out.println(ex.getMessage());

        Map<String, Object> body = new LinkedHashMap<>();
        body.put("timestamp", LocalDateTime.now());
        body.put("status", 400);
        body.put("error", ex.getMessage());
        body.put("url", req.getRequestURL());

        return new ResponseEntity<>(body, HttpStatus.NOT_FOUND);
    }
}