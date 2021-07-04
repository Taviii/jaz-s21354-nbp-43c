package pl.pjatk.jazs2135443cnbp.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import pl.pjatk.jazs2135443cnbp.repository.CurrencyRepository;

@Service
public class CurrencyService {
    private final CurrencyRepository currencyRepository;
    private final RestTemplate restTemplate;

    public CurrencyService(CurrencyRepository currencyRepository, RestTemplate restTemplate) {
        this.currencyRepository = currencyRepository;
        this.restTemplate = restTemplate;
    }

//    public Double getTables(String currencyName, String startDate, String endDate) {
//        String resourceUrl = "https://api.nbp.pl/api/exchangerates/tables/a/2015-01-01/2015-01-05/" + currencyName + "/" + startDate + "/" + endDate +
//                "/?format=json";
//
//    }
}