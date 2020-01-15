package inheritance;

import org.junit.Before;
import org.junit.Test;

import java.util.HashSet;

import static org.junit.Assert.*;


public class TheaterTest {
    Theater testEmptyTheater;
    Theater testOneScreenTheater;
    Theater testTypicalTheater;
    HashSet<String> movies = new HashSet<>();

    @Before
    public void setup() {
        testEmptyTheater = new Theater("Regal");
        testOneScreenTheater = new Theater("Century", "1917");
        movies.add("1917");
        movies.add("Jumanji");
        movies.add("Frozen II");
        testTypicalTheater = new Theater("Cinemark", movies);
    }

    @Test
    public void testEmptyTheater() {
        assertEquals("Theater Name should be Regal", "Regal", testEmptyTheater.getName());
    }

    @Test
    public void testOneScreenTheater() {
        assertEquals("Theater name should be Century", "Century", testOneScreenTheater.getName());
        assertTrue("Movie name should be in theaters", testOneScreenTheater.getMovies().contains("1917"));
    }

    @Test
    public void testTypicalTheater() {
        assertEquals("Theater name should be Cinemark", "Cinemark", testTypicalTheater.getName());
        assertEquals("Movies should be in theaters", movies, testTypicalTheater.getMovies());
    }

    @Test
    public void testAddMovie() {
        String newMovie = "Star Wars";
        testTypicalTheater.addMovie(newMovie);
        assertTrue("Star Wars should be in theaters", testTypicalTheater.getMovies().contains(newMovie));
    }

    @Test
    public void testRemoveMovieInMovies() {
        String newMovie = "1917";
        testTypicalTheater.removeMovie(newMovie);
        assertFalse("Star Wars should not be in theaters", testTypicalTheater.getMovies().contains(newMovie));
    }
    @Test
    public void testRemoveMovieNotInMovies() {
        String newMovie = "Star Wars";
        testTypicalTheater.removeMovie(newMovie);
        assertFalse("Star Wars should not be in theaters", testTypicalTheater.getMovies().contains(newMovie));
    }

    @Test
    public void testToString() {
        String expectedOutput = "Theater Name: Regal";
        assertEquals("To string should return expected output", expectedOutput, testEmptyTheater.toString());
    }

    @Test
    public void testAddReview() {
        Review theaterReview = new Review("This is a good review", 5, "Me");
        testOneScreenTheater.addReview(theaterReview);
        assertTrue("Should contain review", testOneScreenTheater.getReviews().contains(theaterReview));
    }

}
