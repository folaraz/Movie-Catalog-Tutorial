package com.folaraz.moviecatalogservice.controller;


import com.folaraz.moviecatalogservice.models.MovieCatalog;
import com.folaraz.moviecatalogservice.models.MovieRating;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/catalog")
public class MovieCatalogController {

    private List<MovieRating> movieRatings = Arrays.asList(
            new MovieRating("1298", 4),
            new MovieRating("7379",  5));

    @GetMapping("{userId}")
    public List<MovieCatalog> getCatalogItems(@PathVariable("userId") String userId){

        return movieRatings.stream().map(movieRating -> {
            return new MovieCatalog("Tazan", "Stupid Heroic Movie", 5);
        })
                .collect(Collectors.toList());


    }




}
