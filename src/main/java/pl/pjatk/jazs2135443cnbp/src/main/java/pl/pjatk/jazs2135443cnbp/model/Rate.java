package pl.pjatk.jazs2135443cnbp.model;

public class Rate {
    private String currency;
    private String code;
    private double mid;

    public String getCurrency() { return currency; }
    public void setCurrency(String value) { this.currency = value; }

    public String getCode() { return code; }
    public void setCode(String value) { this.code = value; }

    public double getMid() { return mid; }
    public void setMid(double value) { this.mid = value; }

    public Rate(String currency, String code, double mid) {
        this.currency = currency;
        this.code = code;
        this.mid = mid;
    }

    public Rate() {
    }
}

