public class App {
    public static void main(String[] args) throws Exception {
        int[] arr={78,45,89};
        printArray(arr);
    }

    public static void printArray(int[] arr){
        System.out.print("[");
        for(int i=0; i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("\b]");
    }
}
