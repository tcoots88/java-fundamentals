package inheritance;

import java.util.*;


public class Restaurant {

    String name;
    double rating;
    String priceCategory;
    LinkedList<Review> allReviews = new LinkedList<>();

    public Restaurant (String name, double rating, int priceCategory) {

        this.name = name;
        this.rating = rating;
        StringJoiner priceCat = new StringJoiner("");
        for( int i = 0; i < priceCategory;i++) {
            priceCat.add("$");
        }
        this.priceCategory = priceCat.toString();
    }

    public double newRestaurantRating() {
        double allStars = 0;
        for (Review review : allReviews) {
            allStars += review.stars;
        }
        double averageStars = allStars/allReviews.size();
        this.rating = averageStars;
        return averageStars;
    }

    public void addReview(Review review){
        allReviews.add(review);
    }



    public String toString(){
        ;
        StringJoiner buisnessInfo = new StringJoiner("\n");
        buisnessInfo.add(String.format("Restaurant: %s\n %.1f stars.\n %s price category", this.name, this.rating, this.priceCategory));


        return  buisnessInfo.toString();
    }





}
