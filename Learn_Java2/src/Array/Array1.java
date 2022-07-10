package Array;

public class Array1 {
	
	public static void main(String[] args) {
		int [] arr = new int[10];
		int total = 0;
		
		
		//for문으로 10까지 숫자를 안만들경우 
		//int[] arr = new int[] {1,2,3,4,5,6,7,8,9,10}
		for(int i=0, num = 1; i<arr.length; i++) {
			arr[i] = num++;
			System.out.println(arr[i]);
		}
		for(int num : arr) {
			total += num;
		}
		System.out.println(total);
	}
}
