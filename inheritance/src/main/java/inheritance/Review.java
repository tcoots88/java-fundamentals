package inheritance;

public class Review {
    private String description;
    private String author;
    private Integer rating;
    private Restaurant restaurant;
    private Theater theater;
    private Shop shop;

    public Review(String description, int rating, String author) {
        this.description = description;
        this.rating = rating;
        this.author = author;
    }

    public Review(String description, int rating, String author, Restaurant restaurant) {
        this.description = description;
        this.rating = rating;
        this.author = author;
        this.restaurant = restaurant;
        restaurant.addReview(this);
    }

    public Review(String description, int rating, String author, Theater theater) {
        this.description = description;
        this.rating = rating;
        this.author = author;
        this.theater = theater;
        theater.addReview(this);
    }


    public Review(String description, int rating, String author, Shop shop) {
        this.description = description;
        this.rating = rating;
        this.author = author;
        this.shop = shop;
        shop.addReview(this);
    }

    public Integer getRating() {
        return rating;
    }

    public String getDescription() {
        return description;
    }

    public String getAuthor() {
        return author;
    }

    public void setTheater(Theater theater) {
        this.theater = theater;
    }

    public void setShop(Shop shop) {
        this.shop = shop;
    }

    public Restaurant getRestaurant() {
        return restaurant;
    }

    public void setRestaurant(Restaurant restaurant) {
        this.restaurant = restaurant;
    }

    @Override
    public String toString() {
        return String.format("Restaurant: %s\nReview: %s \nRating: %s\nAuthor: %s", restaurant.getName(), description, rating, author);
    }
}
