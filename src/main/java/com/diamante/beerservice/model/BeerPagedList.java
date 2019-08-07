package com.diamante.beerservice.model;

import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;

import java.util.List;

public class BeerPagedList extends PageImpl<BeerResponse> {
    public BeerPagedList(List<BeerResponse> content, Pageable pageable, long total) {
        super(content, pageable, total);
    }

    public BeerPagedList(List<BeerResponse> content) {
        super(content);
    }
}
