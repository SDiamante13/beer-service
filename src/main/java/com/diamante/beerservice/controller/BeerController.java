package com.diamante.beerservice.controller;

import com.diamante.beerservice.model.Beer;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RequestMapping("/api/v1/beer")
@RestController
public class BeerController {

    @GetMapping("/{beerId}")
    public ResponseEntity<Beer> getBeerById(@PathVariable("beerId") UUID beerId) {
        return new ResponseEntity<>(Beer.builder().beerName("Beer").build(), HttpStatus.OK);
    }

    @PostMapping()
    public ResponseEntity saveNewBeer(@RequestBody Beer beer) {
        return new ResponseEntity(HttpStatus.CREATED);
    }

    @PutMapping("/{beerId}")
    public ResponseEntity updateBeerById(@PathVariable("beerId") UUID beerId, @RequestBody Beer beer) {
        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }
}
