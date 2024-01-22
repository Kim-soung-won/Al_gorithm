import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int size = scanner.nextInt();
		int[] arr = new int[size];
		for(int i=0; i<size; i++) {
			arr[i] = scanner.nextInt(); 
		}
		for(int i=0; i<size; i++) {
			for(int j=0; j<size-1; j++) {
				if(arr[j]>arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		for(int i=0; i<size; i++) {
			System.out.println(arr[i]);
		}
	}
}
