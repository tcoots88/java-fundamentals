package inheritance;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class ShopTest {
    Shop testShop;

    @Before
    public void setup() {
        testShop = new Shop("Nugget", "Best damn grocery store", "$$");
    }

    @Test
    public void testNewShop() {
        assertEquals("Shop Name should be Nugget", "Nugget", testShop.getName());
        assertEquals("Shop description should be Best damn grocery store", "Best damn grocery store", testShop.getDescription());
        assertEquals("Shop price should be $$", "$$", testShop.getPrice());
    }

    @Test
    public void testToString() {
        String expectedOutput = "Shop Name: Nugget\nDescription: Best damn grocery store\nPrice: $$\nRating: No Stars";
        assertEquals(expectedOutput, expectedOutput, testShop.toString());
    }

    @Test
    public void testAddReview() {
        Review review = new Review("This is a good review", 5, "Me");
        testShop.addReview(review);
        assertTrue("Should contain review", testShop.getReviews().contains(review));
    }
}

