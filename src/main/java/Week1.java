

import java.util.Scanner;

public class Week1 {
    public static void main(String[] args) {

        int width = 10;
        int height = 5;
        double areaofRectangle = height * width;
        double perimeterofRectangle = 2 * (height + width);
        System.out.println("AreaofRectangle is:" + areaofRectangle);
        System.out.println("PerimeterofRectangle is:" + perimeterofRectangle);

        calculateAreaOfHexagon();
        calculateTheDistance();
        reverseString();
        printOddNumbers();
        convertStringIntoLowercase();
        printMultipleNumbers();
        checkIfNumberIsPalindrome();


    }


    public static void calculateAreaOfHexagon() {

        double side = 10;
        double area = areaofHexagon(side);

        System.out.println("The area of the Hexagon is " + area);

    }

    private static double areaofHexagon(double side) {
        double area = 3 * 1.732 * 10 * 10 / 2;
        return area;
    }


    //Ex2
    public static void calculateTheDistance() {

        // New York
        double lat1 = 40.7128;
        double lon1 = 74.0059;

        // London
        double lat2 = 51.5074;
        double lon2 = 0.1278;

        System.out.println("Distance: " + distance(lat1, lon1, lat2, lon2));
    }

    public static double distance(double lat1, double lon1, double lat2, double lon2) {
        lat1 = Math.toRadians(lat1);
        lon1 = Math.toRadians(lon1);
        lat2 = Math.toRadians(lat2);
        lon2 = Math.toRadians(lon2);

        //double earthRadius = 6371.01; //Kilometers
        double earthRadius = 3959; // Miles
        return earthRadius * Math.acos(Math.sin(lat1) * Math.sin(lat2) + Math.cos(lat1) * Math.cos(lat2) * Math.cos(lon1 - lon2));
    }
    //Ex3

    private static void reverseString() {
        String stringToReverse = "PentaStagiu";

        String result = "";

        for (int i = stringToReverse.length() - 1; i >= 0; i--) {
            result = result + stringToReverse.charAt(i);

        }
        System.out.println(result);
    }

    //Ex4

    private static void printOddNumbers() {
        for (int i = 1; i <= 99; i++) {
            if (i % 2 == 1) {
                System.out.println(i);
            }

        }
    }

    //Ex5
    private static void convertStringIntoLowercase() {
        String stringToLowercase = "StringToLOWERCASE";
        String result = stringToLowercase.toLowerCase();

        System.out.println(result);

    }


    //Ex6

    private static void printMultipleNumbers(){

        for (int i=1; i<=100;i++){

            if (i % 3 == 0 && i % 5 == 0){

                System.out.println("fizz buzz");
            }
            else if (i%5==0){
                System.out.println("Buzz");
            }
            else if (i%3==0){
                System.out.println("Fizz");
            }
            else {
                System.out.println(i);
            }
        }


    }

    //Ex7

    private static void checkIfNumberIsPalindrome(){
        int i = 123;
        int copy = i;

        int result = 0;

        while (i !=0){
            result = result * 10 + i% 10;
            i = i / 10;

        }
        if (copy == result){
            System.out.println("TheNumberIsPalindrome");

        }
        else {

            System.out.println("The number is not palindrome");
        }
    }
}





    




























