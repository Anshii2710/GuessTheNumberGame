
/* Create a class which allows a user to play " Guess the Number Game"
Game should have the following methods:
1.Constructor to generate the random number
2.takeUserInput() to take a user input of number
3.isCorrectNumber()to detect the correctness of the number entered by the user
4.getter and setter for noOfGuesses
 */

import java.util.*;
public class GuessTheNumberGame {
    int num;
    int randNum;
    int noOfGuesses;
    public GuessTheNumberGame(){
        Random r=new Random();
        randNum=r.nextInt(101);
        noOfGuesses=0;
        num=0;

    }

    public void takeUserInput(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Guess the number between 0 and 100");
        num=sc.nextInt();
    }
    public int isCorrectNumber(){
        noOfGuesses++;

        if(num==randNum) {
            System.out.println("You have guessed the correct number!!");
            setNoOfGuesses(noOfGuesses);
            return 1;
        }
        else if(num<randNum) {
            System.out.println("Your guessed number is less than the  number");

            return 0;
        }
        else{
            System.out.println("Your guessed number is more than the number");

            return 0;
        }
    }

    public int getNoOfGuesses(){
        return noOfGuesses;
    }

    public void setNoOfGuesses(int g){
        noOfGuesses=g;

    }

    public static void main(String[] args) {
        GuessTheNumberGame ob=new GuessTheNumberGame();
        int c=0;
        do {
            ob.takeUserInput();
            c = ob.isCorrectNumber();
            if (c == 1) {
                int g = ob.getNoOfGuesses();
                System.out.printf("You have got your answer correct after %d attempts:", g);
            }
        }while(c!=1);


    }
}
