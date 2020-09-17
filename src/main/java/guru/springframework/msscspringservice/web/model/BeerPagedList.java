package guru.springframework.msscspringservice.web.model;

import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * Created by jojiv on 2020-09-17
 */
public class BeerPagedList extends PageImpl<BeetDto> {
    public BeerPagedList(List<BeetDto> content, Pageable pageable, long total) {
        super(content, pageable, total);
    }

    public BeerPagedList(List<BeetDto> content) {
        super(content);
    }
}
