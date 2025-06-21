package pl.pjatk.jaz_s30566_nbp.Model;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "exchange")
public class Exchange {


    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;
    private String currency;
    private LocalDateTime startDate;
    private LocalDateTime endDate;
    private String exchangeRate;
    private LocalDateTime queryTime;

    public Exchange(Integer id, String currency, LocalDateTime startDate, LocalDateTime endDate, String exchangeRate, LocalDateTime queryTime) {
        this.id = id;
        this.currency = currency;
        this.startDate = startDate;
        this.endDate = endDate;
        this.exchangeRate = exchangeRate;
        this.queryTime = queryTime;
    }

    public Exchange(String currency, LocalDateTime startDate, LocalDateTime endDate, String exchangeRate, LocalDateTime queryTime) {
        this.currency = currency;
        this.startDate = startDate;
        this.endDate = endDate;
        this.exchangeRate = exchangeRate;
        this.queryTime = queryTime;
    }

    public Exchange() {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public LocalDateTime getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDateTime startDate) {
        this.startDate = startDate;
    }

    public LocalDateTime getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDateTime endDate) {
        this.endDate = endDate;
    }

    public String getExchangeRate() {
        return exchangeRate;
    }

    public void setExchangeRate(String exchangeRate) {
        this.exchangeRate = exchangeRate;
    }

    public LocalDateTime getQueryTime() {
        return queryTime;
    }

    public void setQueryTime(LocalDateTime queryTime) {
        this.queryTime = queryTime;
    }
}
