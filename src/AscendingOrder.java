public class AscendingOrder {
    public static void main(String[] args) {
        int array[] = {23,34,45,67,54,2,3,4,1};

        AscendingOrder asc = new AscendingOrder();
        asc.ascend(array);
    }

    public void ascend(int array[]) {
        for(int i = 0; i < array.length; i++) {
            for(int j = i; j < array.length; j++) {
                if(array[i] > array[j]) {
                    int t = array[i];
                    array[i] = array[j];
                    array[j] = t;
                }
            }
        }

        System.out.println("Prrinting array in ascending order.....");

        for(int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
