package inheritance;

import org.junit.Test;
import static org.junit.Assert.*;

public class ReviewTest {
    @Test
    public void testNewReviewThreeArguments() {
        Review review = new Review("This is a good review", 5, "Me");
        String[] outputValues = {"This is a good review", "5", "Me"};
        assertArrayEquals(outputValues, new String[] {review.getDescription(), Integer.toString(review.getRating()), review.getAuthor()});

    }

    @Test
    public void testNewReviewFourArguments() {
        Restaurant newRestaurant = new Restaurant("Texas de Brazil", "$$");
        Review review = new Review("This is an ok review", 3, "Me", newRestaurant);

        String[] outputValues = {"This is an ok review", "3", "Me", newRestaurant.toString()};
        assertArrayEquals(outputValues, new String[] {review.getDescription(), Integer.toString(review.getRating()), review.getAuthor(), review.getRestaurant().toString()});
    }

    @Test
    public void testToString() {
        Restaurant newRestaurant = new Restaurant("Texas de Brazil", "$$");
        Review review = new Review("This is an ok review", 3, "Me", newRestaurant);
        assertEquals("Restaurant: Texas de Brazil\nReview: This is an ok review \nRating: 3\nAuthor: Me", review.toString());
    }
}
