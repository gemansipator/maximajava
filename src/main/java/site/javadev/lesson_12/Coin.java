package site.javadev.lesson_12;

import java.util.Objects;

public class Coin {
    private Integer nominal;
    private Double diameter;
    private String country;
    private Integer yearOfIssue;

    public Coin(Integer nominal, Double diameter, String country, Integer yearOfIssue) {
        this.nominal = nominal;
        this.diameter = diameter;
        this.country = country;
        this.yearOfIssue = yearOfIssue;
    }

    public Integer getNominal() {
        return nominal;
    }

    public void setNominal(Integer nominal) {
        this.nominal = nominal;
    }

    public Double getDiameter() {
        return diameter;
    }

    public void setDiameter(Double diameter) {
        this.diameter = diameter;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Integer getYearOfIssue() {
        return yearOfIssue;
    }

    public void setYearOfIssue(Integer yearOfIssue) {
        this.yearOfIssue = yearOfIssue;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Coin{");
        sb.append("nominal=").append(nominal);
        sb.append(", diameter=").append(diameter);
        sb.append(", country='").append(country).append('\'');
        sb.append(", yearOfIssue=").append(yearOfIssue);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Coin coin = (Coin) o;
        return Objects.equals(nominal, coin.nominal) && Objects.equals(diameter, coin.diameter) && Objects.equals(country, coin.country) && Objects.equals(yearOfIssue, coin.yearOfIssue);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nominal, diameter, country, yearOfIssue);
    }

    public Coin() {
    }
}
