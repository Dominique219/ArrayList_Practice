import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class git {
	public static void main(String[] args) {

		Integer a[] = {1,2,3,4,5,1};
		List<Integer> al = Arrays.asList(a);
		
		for(int i = 0; i< al.size(); i++) {
			for(int j = i+1; j<al.size();j++) {
				if(al.get(i).equals(al.get(j))) {
					System.out.println(al.get(j));
				}
			}
		}
		System.out.println("Hello World!");
		
		Set<Integer> s = new HashSet<>();
		for(int i: al) {
			if(!s.add(i)) {
				System.out.println("This is the duplicate element: " + i);
			}
		}
		
		
		Integer e[] = {12,34,5654,234,654,234,645};
		int lar = e[0];
		int slar = e[0];
		for(int i = 0; i < e.length; i++) {
			if(e[i]>lar) {
				slar = lar;
				lar = e[i];
			}else if(e[i]>slar) {
				slar = e[i];
			}
		}
		System.out.println(lar);
		System.out.println(slar);
		
		for(int i =0; i<e.length;i++) {
			for(int j = i+1; j<e.length;j++) {
				if(e[i].equals(e[j])) {
					System.out.println(e[j]);
				}
			}
			System.out.println("Hello World!!");
			System.out.println("123123");
		}
	}
}
