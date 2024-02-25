public class App {
    public static void main(String[] args) throws Exception {
        int[] arr1 ={0, 2, 3, 4};
        moveZeroesToEnd(arr1);
    }

    public static void moveZeroesToEnd(int[] arr){
        int j=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0 && arr[j]==0){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
            if(arr[j]!= 0){
                j++;
            }
        }
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
