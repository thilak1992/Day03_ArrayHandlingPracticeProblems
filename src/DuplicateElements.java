import java.util.ArrayList;

public class DuplicateElements {
    public static void main(String[] args) {
        int array[] = {34,1,34,1,4,3,2,2,1,34,3,1,2,7,3};
        boolean ifPresent = false;

        System.out.println("Printing Duplicate Elements from array....");

        ArrayList<Integer> al = new ArrayList<Integer>();

        for (int i = 0; i < array.length; i++) {
            for (int j = i+1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    if (al.contains(array[i])) {
                        break;
                    } else {
                        al.add(array[i]);
                        ifPresent = true;
                    }
                }
            }
        }

        if (ifPresent == true) {
            System.out.println(al);
        } else {
            System.out.println("No Duplicates Found in array.....");
        }
    }
}
