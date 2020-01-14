package inheritance;

import org.junit.Test;

public class ReviewTest {
    @Test
    public void testReviewConstructorAndToString() {
        Review testReview = new Review("Mickey D's", "Bob", 2);
        System.out.println("Tee = " + testReview.toString());
    }


}
