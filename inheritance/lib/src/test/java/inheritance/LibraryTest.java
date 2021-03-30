/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package inheritance;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class LibraryTest {
    @Test public void testRestaurantString() {
        Restaurant test = new Restaurant("test", 0, 0);
        System.out.println(test);
        assertEquals("test is a 0 star restaurant with a price rating of 0", test.toString());
    }
    @Test public void testReviewString() {
        Review test = new Review("test", "test", 1);
//        System.out.println(test);
        assertEquals("test says: test and gives 1 stars", test.toString());
    }
    @Test public void testRestaurantReview(){
        Restaurant testR = new Restaurant("test", 0, 0);
        testR.addReview("body", "shay", 1);
        System.out.println(testR.reviewList.get(0));
        Review testRv = new Review("body", "shay", 1);
        assertEquals(testRv.toString(), testR.reviewList.get(0).toString());
    }
    @Test public void testCalcStars(){
        Restaurant testR = new Restaurant("test", 0, 0);
        testR.addReview("body", "shay", 1);
        testR.addReview("body", "shay", 2);
        testR.calcStarRating();
        Integer expect = 1;
        assertEquals(expect, testR.stars);


    }
    @Test public void testShopToString(){
        Shop test1 = new Shop("testShop1", "Big long description asalsadsnmgs", 3);
        Shop test2 = new Shop("test2Shop", "Big long description asalsadsnmgsxfdfsdxfcv", 2);
        String expectOut1 = "testShop1 is a 0 star shop with a price rating of 3. Description: Big long description asalsadsnmgs";
        String expectOut2 = "test2Shop is a 0 star shop with a price rating of 2. Description: Big long description asalsadsnmgsxfdfsdxfcv";
        assertEquals(expectOut1, test1.toString());
        assertEquals(expectOut2, test2.toString());
    }
    @Test public void testShopReview(){
        Shop testS = new Shop("test", "sdsasd", 0);
        testS.addReview("body", "shay", 1);
        Review testRv = new Review("body", "shay", 1);
        assertEquals(testRv.toString(), testS.reviewList.get(0).toString());
        Shop testS1 = new Shop("test", "sdsasdsadsa", 0);
        testS1.addReview("sdsasd", "shay", 1);
        Review testRv1 = new Review("sdsasd", "shay", 1);
        assertEquals(testRv1.toString(), testS1.reviewList.get(0).toString());
    }

    @Test public void testTheaterToString(){
        List testList = new ArrayList<String>();
        testList.add("Snowpiercer");
        Theater testT = new Theater("Regulia",testList);
        System.out.println(testT);
        String expectOut = "Regulia is a null star theater with a movie list of: [Snowpiercer]";
        assertEquals(expectOut, testT.toString());
        List testList1 = new ArrayList<String>();
        testList1.add("Snowpiercer");
        testList1.add("Ocean's 11");
        Theater testT1 = new Theater("Sometheater",testList1);
        System.out.println(testT1);
        String expectOut1 = "Sometheater is a null star theater with a movie list of: [Snowpiercer, Ocean's 11]";
        assertEquals(expectOut1, testT1.toString());
    }
    @Test public void testTheaterReview(){
        List testList = new ArrayList<String>();
        testList.add("Snowpiercer");
        Theater testT = new Theater("Regulia",testList);
        testT.addReview("dopesauce","shay", 5);
        Review rv = new Review("dopesauce","shay", 5);
        assertEquals(rv.toString(), testT.reviewList.get(0).toString());
    }
    @Test public void testMovieReview(){
        List testList = new ArrayList<String>();
        testList.add("Snowpiercer");
        Theater testT = new Theater("Regulia",testList);
        testT.addReview("dopesauce","shay", 5, "Snowpiercer");
        Review rv = new Review("dopesauce","shay", 5, "Snowpiercer");
        Review rvWrong = new Review("dopesauce","shay", 5);
        assertEquals(rv.toString(), testT.reviewList.get(0).toString());
        assertNotEquals(rvWrong.toString(), testT.reviewList.get(0).toString());
    }
    @Test public void testAddRemoveMovie(){
        List testList = new ArrayList<String>();
        testList.add("Snowpiercer");
        Theater testT = new Theater("Regulia",testList);
        testT.addMovie("Wall-e");
        testT.removeMovie("Snowpiercer");
        String expect = "Wall-e";
        assertEquals(expect, testT.movieList.get(0).toString());
    }
}
