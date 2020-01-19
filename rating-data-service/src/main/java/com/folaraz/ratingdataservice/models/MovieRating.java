package com.folaraz.ratingdataservice.models;

import java.util.Objects;

public class MovieRating {

    private String userId;
    private int rating;

    public MovieRating() {
    }

    public MovieRating(String userId, int rating) {
        this.userId = userId;
        this.rating = rating;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
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
        return Objects.equals(userId, that.userId) &&
                Objects.equals(rating, that.rating);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userId, rating);
    }
}
