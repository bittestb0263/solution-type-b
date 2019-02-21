package problem01;

public class Main {
	public static void main(String[] args) {
		int[] arr = { -10, -3, 5, 6, -2 };
		findMaxProduct(arr);
	}

	public static void findMaxProduct(int[] arr) {
		
		//
		// 코드를 완성 하십시오.
		//
		int max = 0;
		int a = 0;
		int b = 0;
		
		for(int i=0; i<arr.length-1; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(i==0 && j==1) {
					a = i;
					b = j;
					max = arr[i]*arr[j];
				}
				else {
					if(max < arr[i]*arr[j]) {
						a = i;
						b = j;
						max = arr[i]*arr[j];
					}
				}
			}
		}
		
		System.out.println("["+arr[a]+","+arr[b]+"]");
		
	}
}
