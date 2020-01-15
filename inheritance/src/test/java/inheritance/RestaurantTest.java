package inheritance;


import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;



public class RestaurantTest {
    Restaurant testRestaurant;
    @Before
    public void setUp(){
        testRestaurant = new Restaurant("Texas de Brazil", 4, 2);
    }

    @Test
    public void testStringMethod() {

        assertEquals("No Dice, Try again", "Restaurant: Texas de Brazil\n" +
                " 4.0 stars.\n" +
                " $$ price category", testRestaurant.toString());
    }

    @Test
    public void testAddReviewAndResult() {
        Review newTestReviewOne = new Review("Best Steak ever", "Evelyn", 4);
        Review newTestReviewTwo = new Review("SO MUCH FOOD", "Shainah", 5);
        testRestaurant.addReview(newTestReviewOne);
        testRestaurant.addReview(newTestReviewTwo);
        assertEquals("Failed to add", "[Review: Best Steak ever\n" +
                " by Evelyn.\n" +
                " 4 star rating., Review: SO MUCH FOOD\n" +
                " by Shainah.\n" +
                " 5 star rating.]", testRestaurant.allReviews.toString());
    }

    @Test
    public void testAverageOfReviews() {
        Review newTestReviewOne = new Review("Best Steak ever", "Evelyn", 4);
        Review newTestReviewTwo = new Review("SO MUCH FOOD", "Shainah", 5);
        testRestaurant.addReview(newTestReviewOne);
        testRestaurant.addReview(newTestReviewTwo);
        double expectedRating = 4.5;
        assertTrue("Failed to get Average",  testRestaurant.newRestaurantRating() == expectedRating);
        assertEquals("Failed to Update", expectedRating, testRestaurant.rating, .01);

    }
}
