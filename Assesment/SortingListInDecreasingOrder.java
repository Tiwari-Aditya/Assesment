import java.util.*;
public class SortingListInDecreasingOrder
{
	public static void main(String[] args) {
		List<Integer> lt = Arrays.asList(4,2,8,3,3,1,1,4,4,6,6,6);		 ;
		solution(lt);
		System.out.println("Sorted List: " + lt );
		
	}
	public static void solution(List<Integer> list){
	    LinkedHashMap<Integer,Integer> map = new LinkedHashMap<>();
	    for(int num : list){
	        map.put(num,map.getOrDefault(num,0)+1);
	    }
	    Collections.sort(list,(a,b)->map.get(b)-map.get(a));
	    
	}
}