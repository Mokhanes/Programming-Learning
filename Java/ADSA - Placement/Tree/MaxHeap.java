import java.util.*;

public class MaxHeap {
    List<Integer> heap;

    public MaxHeap() {
        heap = new ArrayList<>();
    }

    public void insert(int num){
        heap.add(num);
        int i = heap.size()-1;
        heapfyUp(i);
    }

    public void heapfyUp(int i){
        int parent = (i-1)/2;
        if(i>0 && heap.get(i) > heap.get(parent)){
            Collections.swap(heap, i, parent);
            heapfyUp(parent);
        }
       // return;
    }
    
}
