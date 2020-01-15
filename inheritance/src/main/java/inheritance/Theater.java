package inheritance;

import java.util.HashSet;

public class Theater {

    private String name;
    private HashSet<String> movies = new HashSet<>();
    private Integer numStars;
    private HashSet<Review> reviews = new HashSet<>();
    private Integer starsTotal;

    //create theater with no movies
    public Theater(String name) {
        this.name = name;
    }

    //create theater with one movie
    public Theater(String name, String movie) {
        this.name = name;
        addMovie(movie);
    }

    //create theater with hashset of movies
    public Theater(String name, HashSet movies) {
        this.name = name;
        this.movies = movies;
    }

    public void addMovie(String movie) {
        movies.add(movie);
    }

    public void removeMovie(String movie) {
        if(movies.contains(movie))
            movies.remove(movie);
    }

    public String getName() {
        return name;
    }

    public HashSet<String> getMovies() {
        return movies;
    }

    public HashSet<Review> getReviews() {
        return reviews;
    }

    @Override
    public String toString() {
        return String.format("Theater Name: %s", name);
    }

    public void addReview(Review review) {
        Review newReview = review;
        newReview.setTheater(this);

        reviews.add(newReview);
    }
}
