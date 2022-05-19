import java.util.Scanner;
import Exercises.*;
public class Arrays {

	public static void main(String[] args) {
		System.out.println("Введите номер задания(1-33)");
		Scanner scanner = new Scanner(System.in);
		int exToCheck = scanner.nextInt();
		scanner.nextLine();
		
		
		switch (exToCheck) {
		case 1:Ex_N1.ExN1();
		break;
		case 2:Ex_N2.ExN2();
		break;
		case 3:Ex_N3.ExN3();
		break;
		case 4:Ex_N4.ExN4();
		break;
		case 5:Ex_N5.ExN5();
		break;
		case 6:Ex_N6.ExN6();
		break;
		case 7:Ex_N7.ExN7();
		break;
		case 8:Ex_N8.ExN8();
		break;
		case 9:Ex_N9.ExN9();
		break;
		case 10:Ex_N10.ExN10();
		break;
		case 11:Ex_N11.ExN11();
		break;
		case 12:Ex_N12.ExN12();
		break;
		case 13:Ex_N13.ExN13();
		break;
		case 14:Ex_N14.ExN14();
		break;
		case 15:Ex_N15.ExN15();
		break;
		case 16:Ex_N16.ExN16();
		break;
		case 17:Ex_N17.ExN17();
		break;
		case 18:Ex_N18.ExN18();
		break;
		
		default: System.out.println("Нету такого задания");
		break;
		}
		scanner.close();
		System.out.println("Программа отработала");
		
	}

}
