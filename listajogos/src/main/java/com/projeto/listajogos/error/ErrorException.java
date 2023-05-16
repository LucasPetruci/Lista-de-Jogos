package com.projeto.listajogos.error;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class ErrorException extends RuntimeException {

    private static final long serialVersionUID = 1L;
    
    private final String time;

    
    public ErrorException(String message) {
        super(message);
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        this.time = now.format(formatter);
    }
    
    public String getTime() {
        return time;
    }
}
