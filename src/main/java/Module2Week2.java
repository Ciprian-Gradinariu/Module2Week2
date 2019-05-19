import java.util.*;

public class Module2Week2 {

    public static void main(String[] args) {

        orderAQueue();
        palindromeString ();


        //Ex1

        Stack<Character> reversedWord = new Stack();

        String initialWord = "Incomprehensibilities";

        System.out.println(reversedWord.empty());
/*
        reversedWord.push("I");
        reversedWord.push("n");
        reversedWord.push("c");
        reversedWord.push("o");
        reversedWord.push("m");
        reversedWord.push("p");
        reversedWord.push("r");
        reversedWord.push("e");
        reversedWord.push("h");
        reversedWord.push("e");
        reversedWord.push("n");
        reversedWord.push("s");
        reversedWord.push("i");
        reversedWord.push("b");
        reversedWord.push("i");
        reversedWord.push("l");
        reversedWord.push("i");
        reversedWord.push("t");
        reversedWord.push("i");
        reversedWord.push("e");
        reversedWord.push("s");*/

        for (int i=0; i < initialWord.length(); i++) {
            reversedWord.push(initialWord.charAt(i));
        }

        System.out.println(reversedWord.empty());

        System.out.println(reversedWord);


        while (!reversedWord.isEmpty()) {
            System.out.print(reversedWord.pop());


        }
    }


    public static void orderAQueue() {


        Queue<Integer> numbers = new LinkedList<Integer>();


        numbers.add(1);
        numbers.add(2);
        numbers.add(-2);
        numbers.add(9);
        numbers.add(4);
        numbers.add(-5);
        numbers.add(8);
        numbers.add(-8);
        numbers.add(-12);
        numbers.add(15);
        numbers.add(23);

        Stack<Integer> sortedStack = sortQueue(numbers);


        while (!sortedStack.isEmpty()) {
            System.out.print(sortedStack.pop()+" ");

        }


    }

    public static Stack<Integer> sortQueue(Queue<Integer> input)
    {
        Stack<Integer> sortedStack = new Stack<Integer>();
        while(!input.isEmpty())
        {

            int tmp = input.poll();

            while(!sortedStack.isEmpty() && sortedStack.peek()
                    < tmp)
            {
                input.add(sortedStack.pop());
            }

            sortedStack.push(tmp);
        }
        return sortedStack;
    }

    public static void palindromeString() {

        System.out.print("Enter a string:");
        Scanner in = new Scanner(System.in);
        String inputString = in.nextLine();
        Queue queue = new LinkedList();

        for (int i= inputString.length()-1; i >= 0; i--) {
            queue.add(inputString.charAt(i));
        }

        String reverseString = "";

        while (!queue.isEmpty()) {
            reverseString = reverseString + queue.poll();
        }

        if (inputString.equals(reverseString))
            System.out.println("The String is a palindrome");

        else
            System.out.println("The string is not a palindrome");


    }

}







