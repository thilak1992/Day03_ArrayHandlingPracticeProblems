public class largestElement {
    public static void main(String[] args) {
        int array[] = {2,3,4,5,6};
        int max = array[0];

        for (int i = 0; i < array.length; i++ ) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("Largest element in array is " + max );
    }
}

