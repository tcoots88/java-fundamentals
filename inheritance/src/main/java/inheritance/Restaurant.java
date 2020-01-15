package inheritance;

import java.util.ArrayList;

public class Restaurant {
    private String name;
    private String price;
    private Integer numStars;
    private long starsTotal;
    private long numOfReviews;
    ArrayList<Review> reviews = new ArrayList<>();

    public Restaurant(String name, String price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getPrice() {
        return price;
    }

    public int getNumStars() {
        return numStars;
    }

    public boolean containsReview(Review review) {
        return reviews.contains(review);
    }

    public void addReview(Review review) {

        Review newReview = review;
        newReview.setRestaurant(this);

        numOfReviews++;
        starsTotal += newReview.getRating();
        reviews.add(newReview);

        updateNumStars();

    }

    private void updateNumStars() {
        numStars = (int)(starsTotal / numOfReviews);
    }

    @Override
    public String toString() {
        String avgStars = numStars == null ? "No Stars" : Integer.toString(numStars);
        return String.format("Restaurant Name: %s\nPrice: %s \nNumber of Stars: %s", name, price, avgStars);
    }
}
