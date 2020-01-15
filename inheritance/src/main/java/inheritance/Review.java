package inheritance;

public class Review {

    public String description;
    public String critic;
    public int stars;

    public Review(String description, String critic, int stars) {
        this.description = description;
        this.critic = critic;
        this.stars = stars;
    }

    public String toString(){
        return String.format("Review: %s\n by %s.\n %s star rating.", this.description, this.critic, this.stars);
    }
}