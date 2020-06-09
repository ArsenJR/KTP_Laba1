public class Palindrome {
    public static void main(String[] args) {
        for(int i = 0; i < args.length;i++) {
            System.out.println(args[i] + "\t- \t" + isPalindrome(args[i]));
        }
    }
    public static String reverseString(String s){
        String reverse = "";
        for(int i = 0; i<s.length(); i++){
            reverse += s.charAt(s.length()-i-1);
        }
        return reverse;
    }
    public static boolean isPalindrome(String s){
        if(s.equals(reverseString(s))) return true;
        return false;
    }
}

