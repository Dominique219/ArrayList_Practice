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
		
	}
}
