package week1.day1.assignments;

public class CheckNumberIsPositiveOrNegative {
public static void main(String[] args) {
	int a = 35;
	int b = -35;
	int c = 0;
	if (a > 0) {
		System.out.println("This number is positive");
	} else {
		System.out.println("This number is negative");
	}
	if (b < 0) {
		System.out.println("This number is negative");
	} else {
		System.out.println("This number is positive");
	}
	if (c == 0) {
		System.out.println("This number is neither positive nor negative");
	} else {
		System.out.println("This number is negative");
	}
}
}