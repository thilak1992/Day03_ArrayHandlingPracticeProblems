public class SecondLargest {
    public static void main(String[] args) {
        int array[] = {1,2,3,4,5,6,7};
        secLar(array);
    }

    static void secLar(int array[]) {
        for (int i = 0 ; i < array.length ; i++) {
            for (int j = i ; j < array.length ; j++) {
                if(array[i] < array[j]) {
                    int t = array[i];
                    array[i] = array[j];
                    array[j] = t;
                }
            }
        }
        System.out.print("Second largest element in array is " + array[1]);
    }
}
