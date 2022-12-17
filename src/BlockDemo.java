/*
* Jason D. F. D'Oyley
* Demonstrate a block of code.
* Dec 17, 2022
* */

public class BlockDemo {
    public static void main(String[] args) {
        double i, j, d;

        i = 5;
        j = 10;

        // the target to this if is a block
        if (i != 0) {
            System.out.println("i does not equal zero");
            d = j / i;
            System.out.println("j / i is " + d);
        }
    }
}
