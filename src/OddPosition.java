public class OddPosition {
    public static void main(String[] args) {
        int array[] = {1,23,42,21,32,56,74};

        System.out.println("Printing Elements from odd position....");

        for (int i = 1; i < array.length;) {
            System.out.println(array[i]);
            i += 2;
        }
    }
}
