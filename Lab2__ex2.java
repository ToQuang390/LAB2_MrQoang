package lab2;

import java.util.Scanner;

public class Lab2__ex2 {
 public static void main(String[] args) {
	 Scanner sc=new Scanner(System.in);
	System.out.println("Moi ban nhap vao so nguyen : ");
	int c=sc.nextInt();
	if(c % 2==0) {
		System.out.println("Day la so chan");
		
	}else {
		System.out.println("Day la so le");
	}
}
}
