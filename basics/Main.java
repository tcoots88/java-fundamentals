import java.time.format.DateTimeFormatter;  
import java.time.LocalDateTime;    

public class Main {
  public static void main(String[] args) {

    int dogCount = 1;
    System.out.println("I own " + dogCount + " " + pluralize("dog", dogCount) + ".");
    
    int catCount = 2;
    System.out.println("I own " + catCount + " " + pluralize("cat", catCount) + ".");
    
    int turtleCount = 0;
    System.out.println("I own " + turtleCount + " " + pluralize("turtle", turtleCount) + ".");
   

    flipNHeads(5);

    clock();
  }


  // Feature Tasks


  // First Task - Pluralize
  public static String pluralize(String word, int num){

    if(num >= 2 || num == 0){
      return word + "s";
    } else {
      return word;
    }
      
  }

  // Second Task - flipNHeads 

  public static void flipNHeads(int n) {
    int numHeadsInRow = 0;
    int numFlips = 1;

    while (numHeadsInRow < n) {
      if(Math.random() < 0.5) {
        System.out.println("Tails");
        numHeadsInRow = 0;
      } else {
        System.out.println("Heads");
        numHeadsInRow++;
      } 
      numFlips++; 
    }
    System.out.println("It took " + (numFlips - 1) + " flips to flip " + numHeadsInRow + " heads in a row.");
}


public static void clock() {
  LocalDateTime past = LocalDateTime.now();
  DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
  do {
    LocalDateTime now = LocalDateTime.now();
    int pastSecond = past.getSecond();
    int nowSecond = now.getSecond();
    past = now;
    if(nowSecond - pastSecond == 1)
      System.out.println(now.format(formatter));
  } while(true);
}
}