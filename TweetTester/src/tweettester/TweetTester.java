package tweettester;

import java.util.Scanner;
import java.lang.Math; 
/**
 * @class  AP CSA
 * @author T.Rex Northcut
 */
public class TweetTester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); //read the input
        String tweet = scan.nextLine(); //save the input into a string
        int count=0;
        //increase the count variable for every character in the string
        for(int i=0; i<tweet.length(); i++){
            count++;
        }
        //return the number of characters
        System.out.println("Number of Characters: " + count);
    }
}
