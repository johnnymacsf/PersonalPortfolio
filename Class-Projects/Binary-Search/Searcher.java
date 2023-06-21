import java.util.*;

public class Searcher<T> {
	// Returns the index of the key in the sorted array, or -1 if the 
	// key is not found.
	public static <T> int binarySearch(T[] array, int arraySize, T key, 
			Comparator<T> comparer) {
			   int low = 0;
			   int high = array.length - 1;
			   while(low <= high){
			      int mid = (low + high) / 2;
			      T val = array[mid];
			      int comp = comparer.compare(key,val);
			      if(comp < 0){
			         high = mid - 1;  
			      }else if(comp > 0){
			         low = mid + 1;  
			      }else{
			         return mid;
			      }
			   }
		return -1;
	}
}