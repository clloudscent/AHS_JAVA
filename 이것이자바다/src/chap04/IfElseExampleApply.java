package chap04;

import java.util.Scanner;

public class IfElseExampleApply {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("점수 : ");
		int n = sc.nextInt();
		int score=n;
		
		
		if(score>=90) {
			System.out.println("점수가 100~90 입니다");
			System.out.println("등급은  A입니다");
		}else if (score>=80) {
			System.out.println("점수가 80~89 입니다");
			System.out.println("등급은 B입니다");
		}else if(score>=70) {
			System.out.println("점수가 70~79입니다");
			System.out.println("등급은 C입니다");
		}else {
			System.out.println("점수가 70미만 입니다");
			System.out.println("등급은 D입니다");
		}
		
	}
	
}