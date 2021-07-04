package pl.pjatk.jazs2135443cnbp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.pjatk.jazs2135443cnbp.model.Currency;

public interface CurrencyRepository extends JpaRepository<Currency,Long> {
}
