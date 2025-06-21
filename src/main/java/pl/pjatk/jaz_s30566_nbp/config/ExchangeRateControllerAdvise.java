package pl.pjatk.jaz_s30566_nbp.config;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ExchangeRateControllerAdvise {

    @ResponseStatus(value=HttpStatus.NOT_FOUND)
    public ResponseEntity<String> notFound() {
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Not Found");
    }
    @ResponseStatus(value = HttpStatus.BAD_REQUEST)
    public ResponseEntity<String> badRequest() {
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Bad Request");
    }

}
