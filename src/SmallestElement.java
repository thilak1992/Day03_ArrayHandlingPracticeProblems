public class SmallestElement {
    public static void main(String[] args) {
        int array[] = {2,4,4,5,6,1};
        int min = array[0];

        for (int i = 0; i < array.length; i++ ) {
            if (array[i] < min) {
                min = array[i];
            }
        }

        System.out.println("Largest element in array is " + min);
    }
}
