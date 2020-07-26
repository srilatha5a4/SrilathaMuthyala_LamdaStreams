package epam.com.lambdasteams;

import java.util.*;
import java.util.stream.Collectors;

public class PalindromeOfStrings {
	public static ArrayList<String> Check(ArrayList<String> answer){
		int i=0;
		ArrayList<String> arr = (ArrayList<String>) answer.stream().filter(String->(String.charAt(i)==String.charAt(String.length()-i-1))).collect(Collectors.toList());
		return arr;
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter number of elements:");
		int n = s.nextInt();
		ArrayList<String> ar = new ArrayList<>();
		System.out.println("Enter strings:");
		s.nextLine();
		for(int i = 0;i < n;i++){ 
			String str = s.nextLine();
			ar.add(str);
		}
		System.out.println("The strings that are palindromes are:");
		ArrayList<String> res = Check(ar);
		for(int i = 0;i < res.size();i++){
			System.out.println(res.get(i));
		}
	}

}
