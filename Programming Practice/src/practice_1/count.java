package practice_1;
import java.util.*;

public class count {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		CountOccur(arr,n);
	}
	public static void CountOccur(int arr[],int n) {
		LinkedHashMap<Integer,Integer> map=new LinkedHashMap<>();
		for(int i=0;i<n;i++) {
			if(map.containsKey(arr[i])) {
				map.put(arr[i], map.get(arr[i])+1);
			}else {
				map.put(arr[i], 1);
			}
		}
		for(Map.Entry<Integer,Integer> a:map.entrySet()) {
			System.out.println(a.getKey()+" "+a.getValue());
		}
	}

}
