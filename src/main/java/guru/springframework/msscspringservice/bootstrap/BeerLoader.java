package guru.springframework.msscspringservice.bootstrap;

import guru.springframework.msscspringservice.domain.Beer;
import guru.springframework.msscspringservice.repositories.BeerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

/**
 * Created by jojiv on 2020-09-17
 */
@Component
public class BeerLoader implements CommandLineRunner {
    private final BeerRepository beerRepository;

    public BeerLoader(BeerRepository beerRepository) {
        this.beerRepository = beerRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        loadBeerObjects();
    }

    private void loadBeerObjects() {
        if(beerRepository.count()==0) {
            beerRepository.save(Beer.builder()
                    .beerName("Mango Bobs")
                    .beerStyle("IPA")
                    .quantityToBrew(200)
                    .minOnHand(12)
                    .upc(3370100000001L)
                    .price(new BigDecimal("12.95"))
                    .build());
            beerRepository.save(Beer.builder()
                    .beerName("Galaxy Cat")
                    .beerStyle("PALE_ALE")
                    .quantityToBrew(200)
                    .minOnHand(12)
                    .upc(3370100000002L)
                    .price(new BigDecimal("11.95"))
                    .build());
        }
        System.out.println("Loaded beers :"+ beerRepository.count());
    }



}

//1. Startup this class gets picked up and gets created by Spring context, since its declared as a Component
//2. Spring will inject a BeerRepository impl injected by Spring Data JPA
//3. invoke run() which loads Beer objects into Spring Data only if repo has no data