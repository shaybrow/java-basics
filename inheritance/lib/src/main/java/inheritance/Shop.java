package inheritance;

import java.util.ArrayList;
import java.util.List;

public class Shop extends ReviewNormalization implements Reviewable{
    String name;
    String description;
    int dollarSignRating;
    Integer stars;
    ArrayList<Integer> starList = new ArrayList();
    List reviewList = new ArrayList();

    public Shop(String name, String description, int dollarSignRating) {

        this.name = name;
        this.description = description;
        this.dollarSignRating = dollarSignRating;
    }
    public String toString(){
        return String.format("%s is a %d star shop with a price rating of %d. Description: %s", name,stars, dollarSignRating, description);
    }

    @Override
    public void addReview(String body, String author, Integer stars) {
        reviewList.add(new Review(body, author, stars));
        starList.add(stars);
        calcStarRating();
    }

    @Override
    public void calcStarRating() {
        Integer sum = 0;
        Integer count = 0;
        while ( count < this.starList.size()) {
            Integer temp = (Integer) this.starList.get(count);
            sum += temp;
            count++;
        }
        this.stars = sum/count;

    }
}
