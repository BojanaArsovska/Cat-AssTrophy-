import java.util.ArrayList;
import java.util.Scanner;

public class InputReading {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		
		//int a[] = new int[5];
		//String array[] = new String[5];
		ArrayList<String> array = new ArrayList<>();
		String temp = in.next();
		while(temp != "/") {
			array.add(temp);
			temp = in.next();
		}
		
//		while(i < 5) {
//			array[i++] = in.next();
//		}
		
//		for(int i=0; i<5; i++) {
//			a[i] = in.nextInt();
//		}
		
		for(int i= array.size()-1; i>=0; i--) {
			System.out.println(array.get(i));
		}
		
//		//int n = in.nextInt();
//		//int m = in.nextInt();
//		//char c = in.next().charAt(0);
//		String s = in.nextLine();
//		System.out.println("s = " + s);
	}
}
