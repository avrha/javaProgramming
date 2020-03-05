//An example of a while loop
public class whileLoop {
	public static void main(String[] args) {
		//Problem 1
		int x = 10;
		while (x < 100){
			x += 100;
		}
		System.out.println(x);

		//Problem 2
		int y = 10;
		for (int z = 5; z < 20; z += 5)
			y += z;
		System.out.println(y);

		//Problem 3
		int a = 10, b = 20;
		while(y < 100){
			a += b; //infinite loop
		}
		//Problem 4 
		int c = 11;
		do {
			c += 20;
			System.out.println(c);
		}while(c > 100); //Does not execute
	}	
}
