package Chapter01;

import java.util.Scanner;

//#001 문자 개수 세기 : 주어진 문자열에서 문자 개수를 세는 프로그램을 작성
public class P01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("문자입력 : ");
		String str = sc.nextLine();
		
		System.out.println("주어진 문자열의 문자 개수 : " + str.length());
	}

}
