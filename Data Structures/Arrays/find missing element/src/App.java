public class App {
    public static void main(String[] args) throws Exception {
        int[] arr={2,4,1,8,6,3,7};
        System.out.println(findMissing(arr, 8));
    }

    public static int findMissing(int[] arr,int limit){
        int sum=0;
        int rangeSum=limit*(limit+1)/2;
        for(int i=0;i<arr.length;i++){
                sum+=arr[i];
        }

        int missing=(rangeSum- sum);
        return missing;
    }
}
