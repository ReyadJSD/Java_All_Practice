package main.hackerRanks.introductions;

import java.util.Scanner;

public class StringOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input strings
        String firstString = scanner.nextLine();
        String secondString = scanner.nextLine();

        // Calculate sum of lengths
        int sumOfLengths = firstString.length() + secondString.length();
        System.out.println(sumOfLengths);

        // Determine if firstString is lexicographically greater than secondString
        String comparisonResult = firstString.compareTo(secondString) > 0 ? "Yes" : "No";
        System.out.println(comparisonResult);

        // Capitalize the first letter in both strings
        String capitalizedFirstString = firstString.substring(0, 1).toUpperCase() + firstString.substring(1);
        String capitalizedSecondString = secondString.substring(0, 1).toUpperCase() + secondString.substring(1);
        System.out.println(capitalizedFirstString + " " + capitalizedSecondString);

        scanner.close();
    }
}

//This exercise is to test your understanding of Java Strings. A sample String declaration:
//String myString = "Hello World!"
//The elements of a String are called characters. The number of characters in a String is called the length, and it can be retrieved with the String.length() method.
//Given two strings of lowercase English letters,  and , perform the following operations:
//Sum the lengths of  and .
//Determine if  is lexicographically larger than  (i.e.: does  come before  in the dictionary?).
//Capitalize the first letter in  and  and print them on a single line, separated by a space.
//Input Format
//The first line contains a string . The second line contains another string . The strings are comprised of only lowercase English letters.
//Output Format
//There are three lines of output:
//For the first line, sum the lengths of  and .
//For the second line, write Yes if  is lexicographically greater than  otherwise print No instead.
//For the third line, capitalize the first letter in both  and print them on a single line, separated by a space.
//Sample Input 0
//hello java
//Sample Output
// 9
//No
//Hello Java
//Explanation
//String  is "hello" and  is "java".
//has a length of , and  has a length of ; the sum of their lengths is .
//When sorted alphabetically/lexicographically, "hello" precedes "java"; therefore,  is not greater than  and the answer is No.
//When you capitalize the first letter of both  and then print them separated by a space, you get "Hello Java".
