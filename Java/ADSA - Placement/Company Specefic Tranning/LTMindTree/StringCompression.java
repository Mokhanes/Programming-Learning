import java.util.*;
public class StringCompression{

//Q1 - String Comparession
    //AAABBCCD -> A3B2C2D
    public static String compress(String str){
        int len = str.length();
        int count = 1;
        String res = "";
        for(int i = 0;i<len;i++){
            if(i+1 < len && str.charAt(i) == str.charAt(i+1)){
                count++;
            }else{
                res = res + str.charAt(i) + count;
                count = 1;
            }
        }

        return res;
    }

//Q2 - Length of the Longest SubString Without Duplicate Character
    public static String subStringWDC(String s) {
        int n = s.length();
        int left = 0;  
        int maxLen = 0;
        int start = 0; // track start of best substring
        Map<Character, Integer> map = new HashMap<>();

        for (int right = 0; right < n; right++) {
            char ch = s.charAt(right);

            // if char is repeated, move left pointer
            if (map.containsKey(ch) && map.get(ch) >= left) {
                left = map.get(ch) + 1;
            }

            map.put(ch, right);

            if (right - left + 1 > maxLen) {
                maxLen = right - left + 1;
                start = left;
            }
        }

        return s.substring(start, start + maxLen);
    }


//Q3 - Given a string of characters, find the largest and the smallest word
// if two or more words are the largest or smallest then display the one that
// occurs first In the string.
    public static void findLargestAndSmallest(String str) {
        // split words by spaces
        String[] words = str.split("\\s+");

        String smallest = words[0];
        String largest = words[0];

        for (String word : words) {
            if (word.length() < smallest.length()) {
                smallest = word;
            }
            if (word.length() > largest.length()) {
                largest = word;
            }
        }

        System.out.println("Smallest word: " + smallest);
        System.out.println("Largest word: " + largest);
    }


//Q-4 - Remove all Occurance of all X character
    public static void removeX(){
        String str1 = "Mokhanes Sanjay Kumar Nathis";
        String str2 = "a";
        System.out.println(str1.replaceAll(str2, ""));
    }

//Q-5 - Encryption with (-3) Characters
    public static void encrp3(){

        //(Right Shift (+3) -> (char) (((c - 'A' + s) % 26) + 'A');)
        //(Left Shift (-3) -> (char) (((c - 'A' - s + 26) % 26) + 'A');)
        String text = "Sanjay";
        int s = 3;
        StringBuffer res = new StringBuffer();
        for(int i = 0;i<text.length();i++){
            char c = text.charAt(i);
            if(Character.isUpperCase(c)){
                char ch = (char) (((c - 'A' + s) % 26) + 'A');
                res.append(ch);
            }else if(Character.isLowerCase(c)){
                char ch = (char) (((c - 'a' + s) % 26) + 'a');
                res.append(ch);
            }else{
                res.append(c);
            }
        }
        System.out.println(res);
    }

//Q-6 -maximum difference between any two elements such 
//that the larger element appears after the smaller number.

    public static int maxDiff(int arr[]){
        int n = arr.length; 
        int minElement = arr[0]; 
        int maxDiff = arr[1] - arr[0]; 
 
        for (int i = 1; i < n; i++)  
        { 
            maxDiff = Math.max(maxDiff, arr[i] - minElement); 
 
            minElement = Math.min(minElement, arr[i]); 
        } 
        return maxDiff; 
    }

/* --- Day-2 [09/09/2025] --- */

/*Q-7 - Optimize Cloud Server Usage 
 * 
 * You are managing N cloud servers, each with a usage value given in an array usages[].Your manager 
is only interested in the K-th smallest usage value among all servers. 
Before the review, you are allowed to perform up to M operations. In each operation, you can 
choose one of the currently least-used servers (if there is a tie, you can choose any of them) and 
increase its usage by 1. 
Your task is to determine the maximum possible value of the K-th smallest usage after performing at 
most M operations. 

Input Format 
An integer N – the number of servers. 
An array usages[] of size N, where each element represents the initial usage of a server. 
Two integers: 
K – the position of the usage value your manager is concerned with. 
M – the maximum number of operations you can perform. 

Output Format 
A single integer – the maximum possible value of the K-th smallest usage after performing at most M 
operations.
*/

    public static int getMaxKthUsage(int arr[], int k, int m){

        PriorityQueue<Integer> q = new PriorityQueue<>();
        for(int i : arr)
            q.offer(i);

        for(int i =0;i<m;i++){
            int minUsage = q.poll();
            q.offer(minUsage+1);
        }

        int kthU = 0; 
        for(int i = 0;i<k;i++){
            kthU = q.poll();
        }

        return kthU;
    }

    public static void main(String args[]){
        //System.out.println(compress("AAAABBBC"));


        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter the String: ");
        // String s = sc.next();
        // System.out.println("The Length is : " + subStringWDC(s).length());
        // System.out.println("The SubString is : " + subStringWDC(s));

        //removeX();

        //encrp3();

        int arr[] = {2,2,3,4,5};
        System.out.println(getMaxKthUsage(arr,3,3));

    }
}