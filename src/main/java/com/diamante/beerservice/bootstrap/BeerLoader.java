package com.diamante.beerservice.bootstrap;

import com.diamante.beerservice.entity.Beer;
import com.diamante.beerservice.repository.BeerRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
@Slf4j
@RequiredArgsConstructor
public class BeerLoader implements CommandLineRunner {

    private final BeerRepository beerRepository;

    @Override
    public void run(String... args) throws Exception {
        loadBeerObjects();
    }

    private void loadBeerObjects() {
        if (beerRepository.count() == 0) {
            beerRepository.save(Beer.builder()
                    .beerName("Golden Monkey")
                    .beerStyle("LAGER")
                    .minOnHand(12)
                    .quantityToBrew(200)
                    .upc(3330001709L)
                    .price(new BigDecimal("12.95"))
                    .build());

            beerRepository.save(Beer.builder()
                    .beerName("West Coast")
                    .beerStyle("IPA")
                    .minOnHand(6)
                    .quantityToBrew(250)
                    .upc(27766109287L)
                    .price(new BigDecimal("6.50"))
                    .build());

            beerRepository.save(Beer.builder()
                    .beerName("Chocolate")
                    .beerStyle("STOUT")
                    .minOnHand(24)
                    .quantityToBrew(300)
                    .upc(17267565627L)
                    .price(new BigDecimal("10.05"))
                    .build());
            log.info("Beers loaded into database!");
        }
    }
}
