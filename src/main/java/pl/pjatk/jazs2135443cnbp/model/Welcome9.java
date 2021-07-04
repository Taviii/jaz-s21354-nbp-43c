package pl.pjatk.jazs2135443cnbp.model;

import java.time.LocalDate;

public class Welcome9 {
    private Table table;
    private String no;
    private LocalDate effectiveDate;
    private Rate[] rates;

    public Table getTable() { return table; }
    public void setTable(Table value) { this.table = value; }

    public String getNo() { return no; }
    public void setNo(String value) { this.no = value; }

    public LocalDate getEffectiveDate() { return effectiveDate; }
    public void setEffectiveDate(LocalDate value) { this.effectiveDate = value; }

    public Rate[] getRates() { return rates; }
    public void setRates(Rate[] value) { this.rates = value; }

    public Welcome9(Table table, String no, LocalDate effectiveDate, Rate[] rates) {
        this.table = table;
        this.no = no;
        this.effectiveDate = effectiveDate;
        this.rates = rates;
    }

    public Welcome9() {
    }
}