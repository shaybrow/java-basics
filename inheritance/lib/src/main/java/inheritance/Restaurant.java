package inheritance;

import java.util.ArrayList;
import java.util.List;
// I worked with Stephen Webber on this project


public class Restaurant {
    String name;
    Integer stars;
    int price;
    List reviewList;
    ArrayList  <Integer> starList;
//    Constructor
    public Restaurant(String name, Integer stars, int price) {
        this.name = name;
        this.stars = stars;
        this.price = price;
        this.reviewList = new ArrayList();
        this.starList  = new ArrayList();
//        this assumes rest only has one review otherwise we'd take in a list
        starList.add(stars);

    }
    public String toString(){
        return String.format("%s is a %d star restaurant with a price rating of %d", name, stars, price);
    }
    public void addReview(String body, String author, Integer stars){
        reviewList.add(new Review(body, author, stars, this));
        starList.add(stars);
        calcStarRating(this.starList);
//        call
    }
    public void calcStarRating (ArrayList starList){
        Integer sum = 0;
        Integer count = 0;
//        System.out.println(starList.size());
        while ( count < starList.size()) {
            Integer temp = (Integer) starList.get(count);
//            System.out.println(temp);
            sum += temp;
            count++;
        }
//        System.out.println(sum);
        this.stars = sum/count;
//        System.out.println(this.stars);
    }
}
