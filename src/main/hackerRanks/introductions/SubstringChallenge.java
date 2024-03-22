package main.hackerRanks.introductions;

import java.util.Scanner;
    public class SubstringChallenge {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Input string
            String inputString = scanner.nextLine();

            // Input indices
            int startIndex = scanner.nextInt();
            int endIndex = scanner.nextInt();

            // Extract substring using substring method
            String substring = inputString.substring(startIndex, endIndex);
            System.out.println(substring);

            scanner.close();
        }
    }


//    Given a string,, and two indices,  and , print a substring consisting of all characters in the inclusive range from  to .
//    You'll find the String class' substring method helpful in completing this challenge.Input Format
//    The first line contains a single string denoting .
//    The second line contains two space-separated integers denoting the respective values of  and .
//    Constraints
//    String  consists of English alphabetic letters (i.e., ) only.
//    Output Format
//    Print the substring in the inclusive range from  to.
//    Sample Input
//    Helloworld
//    3 7
//    Sample Output
//    lowo

