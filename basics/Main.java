public class Main{


public static void main (String[] args) {
   int [] j = new int[]{1,2,3,4,5};
System.out.println(pluralize("cat", 4));
System.out.println(pluralize("dog", 0));
System.out.println(pluralize("friend", 1));

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