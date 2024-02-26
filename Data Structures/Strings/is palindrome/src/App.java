public class App {
    public static void main(String[] args) throws Exception {
        String word=" ";
        if(isPalindrome(word)){
            System.out.println(word+" is a Palindrome");
        }else{
            System.out.println(word+" is not a Palindrome");
        }
    }

    public static boolean isPalindrome(String a){
        boolean isExist=true;
        for(int i=0,j=a.length()-1;i<j;i++,j--){
            if(a.charAt(i)!=a.charAt(j)){
                isExist=false;
                break;
            }

        }
        return isExist;
    }
}
