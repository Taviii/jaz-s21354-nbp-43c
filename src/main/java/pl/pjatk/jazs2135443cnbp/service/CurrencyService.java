package pl.pjatk.jazs2135443cnbp.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import pl.pjatk.jazs2135443cnbp.repository.CurrencyRepository;

import java.time.LocalDate;

@Service
public class CurrencyService {
    private final CurrencyRepository currencyRepository;
    private final RestTemplate restTemplate;

    public CurrencyService(CurrencyRepository currencyRepository, RestTemplate restTemplate) {
        this.currencyRepository = currencyRepository;
        this.restTemplate = restTemplate;
    }

    public void getTables(String startDate, String endDate) {
        String resourceUrl = "https://api.nbp.pl/api/exchangerates/tables/a/" + "/" + startDate + "/" + endDate +
                "/?format=json";

        LocalDate start = LocalDate.parse(startDate);
        LocalDate end = LocalDate.parse(endDate);
    }


}