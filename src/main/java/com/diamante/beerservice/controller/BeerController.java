package com.diamante.beerservice.controller;

import com.diamante.beerservice.model.BeerResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RequestMapping("/api/v1/beer")
@RestController
public class BeerController {

    @GetMapping("/{beerId}")
    public ResponseEntity<BeerResponse> getBeerById(@PathVariable("beerId") UUID beerId) {
        return new ResponseEntity<>(BeerResponse.builder().build(), HttpStatus.OK);
    }

    @PostMapping()
    public ResponseEntity saveNewBeer(@RequestBody BeerResponse beerResponse) {
        return new ResponseEntity(HttpStatus.CREATED);
    }

    @PutMapping("/{beerId}")
    public ResponseEntity updateBeerById(@PathVariable("beerId") UUID beerId, @RequestBody BeerResponse beerResponse) {
        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }
}
