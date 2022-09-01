public class Elements {
    public static void main(String[] args) {
        int array[] =  {23,45,67,32};
        Elements.elPrint(array);
    }

    static void elPrint(int array[]) {
        for(int i = 0; i < 4; i++) {
            System.out.println("array" + "[" + i + "] = " + array[i]);
        }
    }
}
