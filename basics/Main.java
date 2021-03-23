import java.util.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Timer;
import java.util.TimerTask;
public class Main{


public static void main (String[] args) {
int none = 0;
int some = 5;
int one = 1;
System.out.println("I have " + none + " " + pluralize("cat", none));
System.out.println("I have " + some + " " + pluralize("food", some));
System.out.println("I have " + one + " " + pluralize("bed", one));
System.out.println(flipNHeads(2));
clock();
}
//https://stackoverflow.com/questions/24894501/java-timer-every-x-seconds/24895050
public static void clock (){
//   int together = 2 + 2;
//  int forever = 5;
//   while(together < forever){
  Timer timeThing = new Timer( );
  timeThing.scheduleAtFixedRate(new TimerTask(){
      
      public void run() {
   LocalDateTime now = LocalDateTime.now();
String time = now.format(DateTimeFormatter.ofPattern("HH:mm:ss"));
System.out.println(time);
      }
 
  }, 1000, 1000);

}

public static String pluralize (String word, float count){
if (count <= 1 && count != 0){
  // System.out.println(word);
  return word;
} else {
  String pluralizedWord = word + "s";
  // System.out.println(pluralizedWord);
  return pluralizedWord;
}
}
public static String flipNHeads (int count){
  int headCounter = 0;
  int attempts = 0;
  while (headCounter < count){

  attempts ++;
if (Math.random() < 0.5){
System.out.println("Tails");
headCounter = 0;
}else{
System.out.println("Heads");
headCounter ++;
}

}
String output = "It took " + attempts + " " + "flips to flip " + count + " " + pluralize("head", count) + " in a row.";
return output;
}

// public static int[] reverseArray (int[] inputArray){
//   int [] outputArray = new int [inputArray.length];
//   int backCounter = inputArray.length-1;
// for (int i = 0; i <= inputArray.length-1 ; i++){
//   outputArray[i] = inputArray[backCounter-i];
//   System.out.println(outputArray[i]);
// }
// return outputArray;
// }



}