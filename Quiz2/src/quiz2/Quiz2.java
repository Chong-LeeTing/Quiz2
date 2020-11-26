package quiz2;

public class Quiz2 {

	public static void main(String[] args) {
		
		// 1.
		//For Loop
		System.out.print("1.");
		System.out.println("For Loop");
		int max = 5;
		for (int n = 1; n <= max; n++) {
		System.out.println(n);
		}
		System.out.println();
		
		//While Loop
		System.out.println("While");
		int a = 1;
		while(a <= max) {
			System.out.println(a);
			a++;
		}
		
		// 2.
		//For Loop
		System.out.print("2.");
		System.out.println("For Loop");
		int total = 25;
		for (int number = 1; number <= (total / 2); number++) {
		total = total - number;
		System.out.println(total + " " + number);
		}
		System.out.println();
		
		//While Loop
		System.out.println("While");
		int sum = 25;
		int b = 1;
		while(b <=sum / 2 ) {
			sum = sum - b;
			System.out.println(sum+" "+b);
			b++;
		}
		
		// 3.
		//For Loop
		System.out.print("3.");
		System.out.println("For Loop");
		for (int i = 1; i <= 2; i++) {
		for (int j = 1; j <= 3; j++) {
		for (int k = 1; k <= 4; k++) {
		System.out.print("*");
		}
		System.out.print("!");
		}
		System.out.println();
		}
		System.out.println();
		
		//While Loop
		System.out.println("While");
		int i = 1;
		while(i <= 2) {
			int j = 1;
			while(j <=3) {
				int k = 1;
				while(k <= 4) {
					System.out.print("*");
					k++;
				}System.out.print("!");
				j++;
			}System.out.println();
			i++;
		}
		
		// 4.
		//For Loop
		System.out.print("4.");
		System.out.println("For Loop");
		int number = 4;
		for (int count = 1; count <= number; count++) {
		System.out.println(number);
		number = number / 2;
		}
		
		//While Loop
		System.out.println("While");
		int num = 4;
		int c = 1;
		while(c <= num) {
			System.out.println(num);
			num = num / 2;
			c++;
		}
		
		
		
	

	}

}
