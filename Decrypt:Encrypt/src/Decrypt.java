import java.util.Scanner;

public class Decrypt {
	
	public static void main(String[] args) {
		int d1,d2,d3,d4;
		Scanner scnr = new Scanner(System.in);
		int UserDigit;
		System.out.print("Enter the Encrypted number:");
		UserDigit = scnr.nextInt();
		d4 = ((UserDigit%10)+3)%10;
		d3 = (((UserDigit%100)/10)+3)%10;
		d2 = (((UserDigit%1000)/100)+3)%10;
		d1 = (((UserDigit%10000)/1000)+3)%10;
		System.out.printf("The Decrypted number:%d%d%d%d\n", d3,d4,d1,d2);
	}
}