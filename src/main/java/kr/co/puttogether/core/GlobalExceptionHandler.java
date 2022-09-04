package kr.co.puttogether.core;

import kr.co.puttogether.common.dto.Response;
import kr.co.puttogether.common.exception.ModelNotFoundException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
@Slf4j
public class GlobalExceptionHandler extends ApiResult {

    @ExceptionHandler(value = {ModelNotFoundException.class})
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public ResponseEntity<Response> handleNotFound(Exception e) {
        log.info("ModelNotFoundException, message: {{}}", e.getMessage());
        return errorResponse(HttpStatus.NOT_FOUND, e);
    }
}
