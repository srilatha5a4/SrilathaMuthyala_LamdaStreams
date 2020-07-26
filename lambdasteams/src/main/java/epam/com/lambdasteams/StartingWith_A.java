package epam.com.lambdasteams;

import java.util.*;
import java.util.stream.Collectors;

public class StartingWith_A {

	public static List<String> start(List<String> checking){
		List<String> result = checking.stream().filter(String-> String.charAt(0) == 'a' && (String.length() == 3) ).collect(Collectors.toList());
		return result;
	}	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of strings");
		int num=sc.nextInt();
		List<String> a = new ArrayList<String>();
		System.out.println("Enter the list ");
		sc.nextLine();
		for(int i=0;i<num;i++) {
			a.add(sc.nextLine());
		}
		System.out.println("The strings are: ");
		List<String> result = start(a);
		result.forEach(str->System.out.println(str));
	}
}
