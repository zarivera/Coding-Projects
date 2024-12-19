// Java Program to demonstrate
// the working of String[] args
// in the main() method

class GeeksforGeeks {

    // Commamd-Line Code ->
    // javac GeeksforGeeks.java
    // java GeeksforGeeks 1 2 3

    public static void main(String[] args)
    {
        System.out.println("This is a Test");
        //print display function
        for (String elem : args)
            System.out.println(elem);
    }
}