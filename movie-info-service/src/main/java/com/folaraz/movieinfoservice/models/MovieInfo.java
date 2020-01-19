package com.folaraz.movieinfoservice.models;

import java.util.Objects;

public class MovieInfo {

    private String movieId;
    private String description;

    public MovieInfo() {
    }

    public MovieInfo(String movieId, String description) {
        this.movieId = movieId;
        this.description = description;
    }

    public String getMovieId() {
        return movieId;
    }

    public void setMovieId(String movieId) {
        this.movieId = movieId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MovieInfo movieInfo = (MovieInfo) o;
        return Objects.equals(movieId, movieInfo.movieId) &&
                Objects.equals(description, movieInfo.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(movieId, description);
    }
}
