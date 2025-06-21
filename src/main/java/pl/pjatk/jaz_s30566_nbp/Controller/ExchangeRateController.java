package pl.pjatk.jaz_s30566_nbp.Controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pl.pjatk.jaz_s30566_nbp.Service.ExchangeService;

import java.time.LocalDateTime;

@RestController
@RequestMapping("/api")
@Tag(name = "Endpoints", description = "Endpoints for getting currency exchange rate")
public class ExchangeRateController {

    @Autowired
    private ExchangeService exchangeService;

    @Operation(summary = "Get avarege price for USD", description = "Returns avarege price of USD for provided range")
    @GetMapping("/avg")
    public ResponseEntity<Double> getAvgUsd(@Parameter(description = "eg. 2025-04-10T00:00:00") @RequestParam LocalDateTime start, @Parameter(description = "eg. 2025-06-15T00:00:00") @RequestParam LocalDateTime end) {

        return ResponseEntity.ok(exchangeService.saveAvgToDb(start, end));
    }

}
