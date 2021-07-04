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
    @ApiModelProperty(notes = "Data wyszukiwania", required = true, dataType = "LocalDate")
    private LocalDate searchDate;
    @ApiModelProperty(notes = "Godzina wyszukiwania", required = true, dataType = "LocalDate")
    private LocalDate searchTime;

    public Currency(Long id, String currencyName, LocalDate startDate, LocalDate endDate, LocalDate searchDate, LocalDate searchTime) {
        this.id = id;
        this.currencyName = currencyName;
        this.startDate = startDate;
        this.endDate = endDate;
        this.searchDate = searchDate;
        this.searchTime = searchTime;
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

    public LocalDate getSearchDate() {
        return searchDate;
    }

    public void setSearchDate(LocalDate searchDate) {
        this.searchDate = searchDate;
    }

    public LocalDate getSearchTime() {
        return searchTime;
    }

    public void setSearchTime(LocalDate searchTime) {
        this.searchTime = searchTime;
    }
}
