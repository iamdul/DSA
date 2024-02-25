public class App {
    public static void main(String[] args) throws Exception {
        int[] arr={35,87,25,96,43,52};
        printArray(removeOddIntegers(arr));

    }

    public static int[] removeOddIntegers(int[] arr){
        int[] brr= new int[0];
        int count=0;
        for(int i=0;i<arr.length;i++){

            if(arr[i]%2 == 0 ){
                count++;
                int[] temp= new int[count];
                for(int j=0; j<brr.length; j++){
                    temp[j]=brr[j];
                }
                temp[brr.length]=arr[i];
                brr=temp;
            }
        }
        return brr;
    }

    public static void printArray(int[] arr){
        System.out.print("[");
        for(int i=0; i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("\b]");
    }
}
