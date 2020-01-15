package inheritance;

import org.junit.Test;
import static org.junit.Assert.*;

public class RestaurantTest {
    @Test
    public void testNewRestaurant() {
        Restaurant newRestaurant = new Restaurant("Texas de Brazil", "$$");
        String[] outputValues = {"Texas de Brazil", "$$"};
        assertArrayEquals(outputValues, new String[] {newRestaurant.getName(), newRestaurant.getPrice()});
    }

    @Test
    public void testToString() {
        Restaurant newRestaurant = new Restaurant("Texas de Brazil", "$$");
        String expectedOutput = "Restaurant Name: Texas de Brazil\nPrice: $$ \nNumber of Stars: No Stars";
        assertEquals(expectedOutput, newRestaurant.toString());
    }

    @Test
    public void testAddReview() {
        Restaurant newRestaurant = new Restaurant("Texas de Brazil", "$$");
        Review restaurantReview = new Review("This is a good review", 5, "Me");
        newRestaurant.addReview(restaurantReview);
        assertTrue("Contains Review", newRestaurant.containsReview(restaurantReview));
    }

    @Test
    public void testUpdateRestaurantStars() {
        Restaurant newRestaurant = new Restaurant("Texas de Brazil", "$$");
        Review restaurantReview = new Review("This is a good review", 5, "Me");
        newRestaurant.addReview(restaurantReview);

        Review restaurantReview2 = new Review("This is an ok review", 3, "Me");
        newRestaurant.addReview(restaurantReview2);

        assertEquals("Contains Review", 4, newRestaurant.getNumStars());
    }
}
