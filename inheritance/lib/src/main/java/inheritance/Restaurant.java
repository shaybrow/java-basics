package inheritance;

import java.util.ArrayList;
import java.util.List;
// I worked with Stephen Webber on this project


public class Restaurant extends ReviewNormalization implements Reviewable{
    String name;
    int price;
    Integer stars;
    List reviewList = new ArrayList();
    ArrayList  <Integer> starList = new ArrayList();
//    Constructor
    public Restaurant(String name, Integer stars, int price) {
        this.name = name;
        this.stars = stars;
        this.price = price;

//        this assumes rest only has one review otherwise we'd take in a list
        starList.add(stars);

    }
    public String toString(){
        return String.format("%s is a %d star restaurant with a price rating of %d", name, stars, price);
    }
    @Override
    public void addReview(String body, String author, Integer stars){
        reviewList.add(new Review(body, author, stars));
        starList.add(stars);
        calcStarRating();
//        call calcStarRating at the end of each review being added to make sure stars are up to date
    }
    @Override
    public void calcStarRating (){
        Integer sum = 0;
        Integer count = 0;
//        System.out.println(starList.size());
        while ( count < this.starList.size()) {
            Integer temp = (Integer) this.starList.get(count);
//            System.out.println(temp);
            sum += temp;
            count++;
        }
//        System.out.println(sum);
        this.stars = sum/count;
//        System.out.println(this.stars);
    }
}
