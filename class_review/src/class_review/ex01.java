package class_review;
/*
1.변수 a에 10을 저장
2.switch문을 활용해서 변수 2로 나눈 나머지가 해당 case에 맞게 이동
3.a를 2로 나눈 나머지가 0과 같으면 case 0으로 하고 짝수라는 단어가 출력되고 break
4. a를 2로 나눈 나머지가 1과같으면 case1 로 하고, 홀수라는 단어가 출력되게 하기
*/
public class ex01 {
	public static void main(String[] args) {
		int a=10; //a에 10을 저장
		switch(a%2) {
		case 0 : 
			System.out.println("짝수");
			break;
		case 2 :
			System.out.println("홀수");
			
		}
	}

}
 
