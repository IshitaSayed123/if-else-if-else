package ques1;
public class Marks_check {
	public static void check_marks(char ch) {
		if(ch=='A' || ch=='a') {
			System.out.println("The marks are between 76 to 100");
		}else if(ch=='B' || ch=='b') {
			System.out.println("The marks are between 51 to 75");
		}else if(ch=='C' || ch=='c') {
			System.out.println("The marks are between 36 to 50");
		}else if(ch=='F' || ch=='f') {
			System.out.println("The marks are between 0 to 35");
		}else {
			System.out.println("Invalid input");
		}
	}
	public static void main(String[] args) {
		check_marks('F');
	}
}
