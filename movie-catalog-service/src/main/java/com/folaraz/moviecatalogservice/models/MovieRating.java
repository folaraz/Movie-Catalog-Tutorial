package com.folaraz.moviecatalogservice.models;

import java.util.Objects;


public class MovieRating {

    private String movieId;
    private int rating;

    public MovieRating() {
    }

    public MovieRating(String movieId, int rating) {
        this.movieId = movieId;
        this.rating = rating;
    }

    public String getmovieId() {
        return movieId;
    }

    public void setmovieId(String movieId) {
        this.movieId = movieId;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MovieRating that = (MovieRating) o;
        return Objects.equals(movieId, that.movieId) &&
                Objects.equals(rating, that.rating);
    }

    @Override
    public int hashCode() {
        return Objects.hash(movieId, rating);
    }
}

