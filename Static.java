
public class Static {
	public static void main(String args[]) {
		Tuple tuple1 = new Tuple();
		Tuple tuple2 = new Tuple();
		tuple1.a = 100;
		tuple1.b = 200;
		tuple2.b = 5;
		
		System.out.println(tuple1.a + " " + tuple1.b + " " + tuple2.a + " " + tuple2.b);
		
	}
}

class Tuple {
	int a;
	static int b;
}
