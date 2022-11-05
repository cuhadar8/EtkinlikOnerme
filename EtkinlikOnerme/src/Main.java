import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Hava sıcaklığını giriniz: ");
		int heat = scanner.nextInt();
		
		if(heat > 25) {
			System.out.println("Yüzmeye gidebilirsiniz.");
		}
		else if(heat <=25 && heat >=5) {
			if(heat<=15) {
				System.out.println("Sinemaya gidebilirsiniz.");
			}
			if(heat>=10) {
				System.out.println("Pikniğe gidebilirsiniz");
			}
		}
		else {
			System.out.println("Kayak yapmaya gidebilirsiniz.");
		}

	}

}
