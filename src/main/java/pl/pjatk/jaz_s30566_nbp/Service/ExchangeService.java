package pl.pjatk.jaz_s30566_nbp.Service;

import USD.UsdRate;
import USD.UsdRoot;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import pl.pjatk.jaz_s30566_nbp.Controller.ExchangeRateController;
import pl.pjatk.jaz_s30566_nbp.Model.Exchange;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Service
public class ExchangeService {

    @Autowired
    private RestTemplate restTemplate;

    public double saveAvgToDb(LocalDateTime start, LocalDateTime end){
        double avg = getAvgUsd(start, end);
        Exchange exchange = new Exchange("USD", start, end, avg, LocalDateTime.now());
        return avg;
    }



    public double getAvgUsd(LocalDateTime start, LocalDateTime end) {
        String url = "https://api.nbp.pl/api/exchangerates/rates/c/usd/" +
                start.format(DateTimeFormatter.ofPattern("yyyy-MM-dd")) + "/" +
                end.format(DateTimeFormatter.ofPattern("yyyy-MM-dd")) + "/?format=json";
        UsdRoot response = restTemplate.getForObject(url, UsdRoot.class);
        double sum = 0;
        int count = 0;
        for (UsdRate rate : response.getRates()) {
            // Assuming you want the average of bid and ask prices
            sum += (rate.getBid() + rate.getAsk()) / 2.0;
            count++;

        }
        return sum / count;
    }
}
