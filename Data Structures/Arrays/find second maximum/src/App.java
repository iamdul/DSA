public class App {
    public static void main(String[] args) throws Exception {
        int[] arr1 = {-1000, 2000, 500, -300, 1500};
        System.out.println(findSecondMaximum(arr1));
    }

    public static int findSecondMaximum(int[] arr){
        if(arr.length==0){
            throw new IllegalArgumentException("Invalid input");
        }
        if(arr.length==1){
            System.out.println("only one element in the array");
        }
        int max1=Integer.MIN_VALUE;
        int max2=Integer.MIN_VALUE;
        for(int i =0;i<arr.length; i++){
            if(max1<arr[i]){
                max2=max1;
                max1=arr[i];
            }
            else if(max1>arr[i] && max2<arr[i]){
                max2=arr[i];
            }
        }
        if(max2==Integer.MIN_VALUE){
            new Error("no second maximum in the array");
            return max2=0; 
        }
        
        return max2;
    }
}
