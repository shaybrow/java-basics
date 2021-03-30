package inheritance;

import java.util.ArrayList;
import java.util.List;

public class Theater extends ReviewNormalization implements Reviewable{
    String name;
    Integer stars;
    List <String> movieList = new ArrayList();
    List reviewList = new ArrayList();
    ArrayList  <Integer> starList = new ArrayList();

    public Theater(String name, List movieList) {
        this.name = name;
        this.movieList = movieList;
    }
    public String toString(){
        return String.format("%s is a %d star theater with a movie list of: " + movieList.toString(), name,stars);
    }

    @Override
    public void addReview(String body, String author, Integer stars) {
        reviewList.add(new Review(body, author, stars));
        starList.add(stars);
        calcStarRating();
    }
    public void addReview(String body, String author, Integer stars, String movie) {
        reviewList.add(new Review(body, author, stars, movie));
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
    public void addMovie(String movie){
        movieList.add(movie);

    }
    public void removeMovie(String movie){
        for (int i = 0; i < movieList.size(); i++) {
//            String temp = movieList.get(i);
            if(movieList.get(i)== movie) movieList.remove(i);
        }

    }
}
