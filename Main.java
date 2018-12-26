package _AB;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int num = stdIn.nextInt();
		ArrayList<String> p = new ArrayList<>();
		
		for (int i = 0; i < num; i++) {
			p.add(stdIn.next());
		}
		
		for (int i = 0; i < p.size(); i++) {
			
			int a = Integer.
					parseInt(p.get(i).split(",")[0]);
			int b = Integer.
					parseInt(p.get(i).split(",")[1]);
			System.out.println(a+b);
		}

	}
}
