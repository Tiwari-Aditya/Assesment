import java.util.*;
public class RemoveDuplicates
{
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>();
		
		al.add(1);
		al.add(2);
		al.add(2);
		al.add(3);
		al.add(4);
		al.add(4);
		removeDuplicates(al);
		for(int a: al){
		    System.out.print(a+" ");
		}
	}
	public static void removeDuplicates(ArrayList<Integer> al){
	    int n = al.size();
	    for(int i=n-1;i>0;i--){
	        if(al.get(i)==al.get(i-1)){
	            al.remove(i);
	        }
	    }
	}
}