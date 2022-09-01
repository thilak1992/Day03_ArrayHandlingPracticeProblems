public class ReverseElement {
    public static void main(String[] args) {
        int array[] = {2,45,31,21,56,4};

        System.out.println("Printing array in reverse order.....");

        for(int i = array.length - 1; i >= 0; i-- ) {
            System.out.println(array[i]);
        }
    }
}
