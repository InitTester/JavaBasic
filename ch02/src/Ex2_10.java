import java.util.Scanner;

public class Ex2_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("두자리 정수를 하나 입력해주세요.>");
		String input = sc.nextLine();
		int num = Integer.parseInt(input);
		
		System.out.println("입력내용 :"+ input);
		System.out.printf("num=%d%n",num);
	}
}
