//this will output first 12 fibonacci sequence numbers
// 0 1 1 2 3 5 8 13 21 34 55 89 144

public class fibonacci {
    public static void main(String[] args) {

        int first = 0;
        int last = 1;

        System.out.print(first + " ");

        //so i put 11 because it will be minus the first sys out
        for (int i = 1; i <= 11; i++) {
            first = first + last;

            System.out.print(first + " ");

            last = first - last;
        }
    }
}