public class App {
    public static void main(String[] args) throws Exception {
        int[] arr4 = {8, 8, 8, 8, 8};
        resizeArray(arr4,10 );
    }

    public static void resizeArray(int[] arr,int capacity){
        int[] temp= new int[capacity];
        for(int i=0; i<arr.length;i++){
            temp[i]=arr[i];
        }
        arr=temp;
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
