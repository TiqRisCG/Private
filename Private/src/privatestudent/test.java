package privatestudent;

import java.util.Scanner;



public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*StudentManagement sms=new StudentManagement();*/
		Scanner scanner = new Scanner(System.in);
		while(true) {
			System.out.println("1. öğrenci ekle: ");
			System.out.println("2. öğrenci çıkışı: ");
			System.out.println("Seciminiz:");
			
			int secim = scanner.nextInt();
			scanner.nextLine();
			
			boolean isExit = false;
			switch(secim) {
			case 1:
				System.out.println(" öğrenci adı: ");
				String name = scanner.nextLine();
				System.out.println(" öğrenci mail: ");
				String email = scanner.nextLine();
			//	sms.addStudent(name, email);
				break;
			case 2:
				isExit = true;
				break;
				default:
			}
			if(isExit) {
			System.out.println("Çıkış yaptınız: ");
			break;
			}
		}
	}

}
