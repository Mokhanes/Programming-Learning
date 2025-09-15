
import java.awt.desktop.SystemSleepEvent;
import java.util.*;

public class Hashing {
    public static void FindMaxFreqElement(){
        Map<Integer, Integer> map = new HashMap<>();
        int arr[] = {1,2,3,4,5,1,2,3,4,5,5,6,7,8,9,10};
        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i], map.get(arr[i])+1);
            }else{
                map.put(arr[i], 1);
            }
        }

        System.out.print(map);

        Integer freValue = 0;
        for(Integer i : map.values()){
            if(i > freValue){
                freValue = i;
            }
        }

        int mostFrequentElement = -1;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue().equals(freValue)) {
                mostFrequentElement = entry.getKey();
                break;
            }
        }
        System.out.println("Most Frequent Element is : " + mostFrequentElement);
    }


    public static void FindMaxHighLowFreqElement(int nums[]){
        Map<Integer, Integer> map = new HashMap<>();

        for(int i =0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i] , map.get(nums[i])+1);
            }else{
                map.put(nums[i],1);
            }
        }

        int minfreqvalue = 0;
        int maxfreqvalue = 0;
        int minfreq = Integer.MAX_VALUE;
        int maxfreq = 0;

        System.out.println(map);

        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            if(entry.getValue() > maxfreq){
                maxfreq = entry.getValue();
                maxfreqvalue = entry.getKey();
            }

            if(entry.getValue() < minfreq){
                minfreq = entry.getValue();
                minfreqvalue = entry.getKey();
            }
        }

        System.out.println("Maximum Frequence ("+maxfreq+") Element : " +maxfreqvalue);
        System.out.println("Minimun Frequence ("+minfreq+") Element : " +minfreqvalue);

    }
    public static void main(String[] args) {
        
        int arr[] = {1,1,1,1,1,2,2,2,2,2,3,3,3,3,5,5,5,7};
        FindMaxHighLowFreqElement(arr);
        
    }

}

