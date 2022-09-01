public class EvenPosition {
    public static void main(String[] args) {
        int array[] = {2,4,56,34,21,6,5,3,76,43};

        System.out.println("Elements of array on even position are .......");

        for(int i = 2; i < array.length;) {
            System.out.println("array" + "[" + i + "] = " + array[i]);
            i += 2;
        }
    }
}
