package pl.pjatk.jazs2135443cnbp.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.pjatk.jazs2135443cnbp.service.CurrencyService;


@RestController
@RequestMapping("/currency")
public class CurrencyController {

    private final CurrencyService currencyService;

    public CurrencyController(CurrencyService currencyService) {
        this.currencyService = currencyService;
    }

    @GetMapping("/tables")
    public ResponseEntity<Void> getTables(@PathVariable String startDate,
                                          @PathVariable String endDate) {
        currencyService.getTables(startDate, endDate);
        return ResponseEntity.ok().build();
    }


}
