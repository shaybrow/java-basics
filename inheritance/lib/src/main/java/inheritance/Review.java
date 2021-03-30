package inheritance;

public class Review {
    String body;
    String author;
    int stars;
    Restaurant restaurant;

    public Review(String body, String author, int stars, Restaurant restaurant) {
        this.body = body;
        this.author = author;
        this.stars = stars;
        this.restaurant = restaurant;
    }
    public String toString(){
        return String.format("%s says: %s and gives %d stars", author, body, stars);
    }
}
