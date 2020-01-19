package com.folaraz.movieinfoservice.controller;


import com.folaraz.movieinfoservice.models.MovieInfo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("movie-info")
public class MovieInfoController {


    private List<MovieInfo> sampleMovieInfo = Arrays.asList(
            new MovieInfo("1", "Stupid Love Movie"),
            new MovieInfo("2", "It will end in tears idiot"),
            new MovieInfo("5", "This is a crucial time in our lives")
    );

    @GetMapping("{movieId}")
    public List<MovieInfo> getMovieInfo(@PathVariable("movieId") String movieId){

        return sampleMovieInfo;
    }

}
