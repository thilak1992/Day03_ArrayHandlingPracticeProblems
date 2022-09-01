public class Frequency {
    public static void main(String[] args) {

        int arr[] = {1, 2, 8, 2 ,2};   //Initialize array
        int fr[] = new int [arr.length]; //Array fr will store frequencies of element
        int visited = -1;

        for(int i = 0; i < arr.length; i++){
            int count = 1;
            for(int j = i+1; j < arr.length; j++){
                if(arr[i] == arr[j]){
                    count++;
                    fr[j] = visited;  //To avoid counting same element again
                }
            }
            if(fr[i] != visited) {
                fr[i] = count;
            }
        }
        //Displays the frequency of each element present in array
        System.out.println("-------------------------");
        System.out.println(" Element | Frequency");
        System.out.println("-------------------------");
        for(int i = 0; i < fr.length; i++){
            if(fr[i] != visited) {
                System.out.println("    " + arr[i] + "    |    " + fr[i]);
            }
        }
        System.out.println("-------------------------");
    }
}
