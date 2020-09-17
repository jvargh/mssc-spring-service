package guru.springframework.msscspringservice.repositories;

import guru.springframework.msscspringservice.domain.Beer;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.UUID;

/**
 * Created by jojiv on 2020-09-17
 */
public interface BeerRepository extends PagingAndSortingRepository<Beer, UUID> {
}
