package epam.com.lambdasteams;

import java.util.*;

public class AvgOfNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of elements");
		int num = sc.nextInt();
		ArrayList<Integer> A = new ArrayList<>();
		System.out.println("Enter elements in list");
		sc.nextLine();
		for(int i = 0;i < num;i++){ 
			A.add(sc.nextInt());
		}
		int sum = A.stream().mapToInt(i -> i.intValue()).sum();
		double avg=0;
		int b=A.size();
		if(b > 0) {
			 avg = sum / A.size();
		}
		System.out.println("Average is : "+avg);
	}

}
