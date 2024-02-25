public class App {
    public static void main(String[] args) throws Exception {
        int[] arr = { 0, 74, 0,-8, 23, 41 };
        reverseArray(arr);
    }
    // public static void reverseArray(int[] arr){
    // System.out.print("[");
    // for(int i=arr.length-1; i>=0;i--){
    // System.out.print(arr[i]+" ");
    // }
    // System.out.println("\b]");
    // }

    public static void printArray(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("\b]");
    }

    public static void reverseArray(int[] arr){
        
        for(int i=0,j=arr.length-1;i<j;i++,j--){
            arr[i]=arr[i]+arr[j];
            arr[j]=arr[i]-arr[j];
            arr[i]=arr[i]-arr[j];
        }

        printArray(arr);
    }
}
