package inheritance;

public class Review {
    String body;
    String author;
    int stars;
    Restaurant restaurant;
    String movie;

    public Review(String body, String author, int stars) {
        this.body = body;
        this.author = author;
        this.stars = stars;

    }
    public Review(String body, String author, int stars, String movie) {
        this.body = body;
        this.author = author;
        this.stars = stars;
        this.movie = movie;

    }
    public String toString(){
        if (this.movie != null) {
            return String.format("%s says: %s about the movie %s and gives %d stars", author, body, movie, stars);
        }
        return String.format("%s says: %s and gives %d stars", author, body, stars);
    }
}
