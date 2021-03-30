package inheritance;

public class Review {
    String body;
    String author;
    int stars;
    Restaurant restaurant;

    public Review(String body, String author, int stars) {
        this.body = body;
        this.author = author;
        this.stars = stars;

    }
    public String toString(){
        return String.format("%s says: %s and gives %d stars", author, body, stars);
    }
}
