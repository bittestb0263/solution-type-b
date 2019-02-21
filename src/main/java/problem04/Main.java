package problem04;

import java.util.Random;

public class Main {
	
	public static void main(String[] args) {
		int count = 0;
		int tempCount = 0;
		int num = 1;
		Random rand = new Random();
		while(count == 0 || count == 2 || count == 5 || count == 7 || count == 9 || count == 10 || count == 12 || count == 14 || count == 15 || 
				count == 17 || count == 19) {
			tempCount = rand.nextInt(4)+1;
			count = count + tempCount;
			System.out.println(num+".  "+tempCount);
			System.out.println("#0##0#0#00#0#00#0#0#");
			for(int i=1; i<count; i++) {
				System.out.print(" ");
			}
			System.out.println("^");
			num++;
		}
		System.out.println("> !  ~");
	}

}
