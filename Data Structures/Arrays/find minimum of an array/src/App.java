public class App {
    public static void main(String[] args) throws Exception {
        int[] arr={45,89,-2,75,1001,-123};
        System.out.println("Minimum value of arr :"+findMin(arr));
    }

    public static int findMin(int[] arr){
        if(arr==null || arr.length==0){
            throw new IllegalArgumentException("Invalid input");
        }
        int min=arr[0];
        for(int i=1;i<arr.length;i++){
            if(min>arr[i]){
                min=arr[i];
            }
        }
        return min;
    }
}
