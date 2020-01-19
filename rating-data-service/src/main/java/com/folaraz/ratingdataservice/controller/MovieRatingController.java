package com.folaraz.ratingdataservice.controller;


import com.folaraz.ratingdataservice.models.MovieRating;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/movie-rating")
public class MovieRatingController {

    @GetMapping("{userId}")
    public MovieRating getMovieRating(@PathVariable("userId") String userId){

        return new MovieRating("2", 5);

    }

}
