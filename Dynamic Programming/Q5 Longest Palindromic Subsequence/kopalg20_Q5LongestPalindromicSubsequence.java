public class kopalg20_Q5LongestPalindromicSubsequence{
    public static int longestPalindromeSubseq(String s) {
        String reverseString = "";
        for(int i = s.length()-1;i>=0;i--){ //String reversal
            reverseString += s.charAt(i);
        }
        return longestCommonSubsequence(s,reverseString);
    }
    public static int longestCommonSubsequence(String text1, String text2) {
        int[] prev = new int[text2.length()+1]; //Intialise prev arr
        for(int i = 1;i<=text1.length();i++){
            int[] curr = new int[text2.length()+1];
            for(int j = 1;j<=text2.length();j++){
                if(text1.charAt(i-1) == text2.charAt(j-1)){ //If character matches reduce both the string
                    curr[j] = 1+prev[j-1];
                }else{
                    curr[j] = Math.max(prev[j],curr[j-1]); // If not matches take maximum either by reducing text1 or text2
                }
            }
            prev = curr;
        }
        return prev[text2.length()];
    }

    public static void main(String[] args) {
        System.out.println(longestPalindromeSubseq("bbbab"));
    }
}