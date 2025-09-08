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
    public static String subStringWDC(String s){
        int max = 0;
        List<Character> li = new ArrayList<>();
        String res = "";
        for(int i = 0 ;i<s.length();i++){
            char ch = s.charAt(i);
            if(!(li.contains(ch))){
                li.add(ch);
            }else if(max < li.size()){
                max = li.size();
                res = "";
                for(Character c : li)
                    res += c;
                li.clear();
            }
        }

        return res;
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

//Q-5 - 
    public static void main(String args[]){
        //System.out.println(compress("AAAABBBC"));


        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter the String: ");
        // String s = sc.next();
        // System.out.println("The Length is : " + subStringWDC(s).length());
        // System.out.println("The SubString is : " + subStringWDC(s));

        removeX();
    }
}