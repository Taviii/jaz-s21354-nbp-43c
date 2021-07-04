package pl.pjatk.jazs2135443cnbp.model;

import io.swagger.annotations.ApiModelProperty;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;

@Entity
public class Currency {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @ApiModelProperty(notes = "Id waluty", required = true, dataType = "Long")
    private Long id;
    @ApiModelProperty(notes = "Nazwa waluty", required = true, dataType = "String")
    private String currencyName;
    @ApiModelProperty(notes = "Data początkowa", required = true, dataType = "LocalDate")
    private LocalDate startDate;
    @ApiModelProperty(notes = "Data końcowa", required = true, dataType = "LocalDate")
    private LocalDate endDate;
    @ApiModelProperty(notes = "średnia wartość", required = true, dataType = "double")
    private double avarageValue;

    public Currency(Long id, String currencyName, LocalDate startDate, LocalDate endDate, double avarageValue) {
        this.id = id;
        this.currencyName = currencyName;
        this.startDate = startDate;
        this.endDate = endDate;
        this.avarageValue = avarageValue;
    }

    public Currency() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCurrencyName() {
        return currencyName;
    }

    public void setCurrencyName(String currencyName) {
        this.currencyName = currencyName;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public double getAvarageValue() {
        return avarageValue;
    }

    public void setAvarageValue(double avarageValue) {
        this.avarageValue = avarageValue;
    }
}
