package chap06.exercises.ex20;

import java.util.Scanner;

public class BankApplication {
	private static Account[] accountArray = new Account[100];
	private static int size = 0;
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		boolean run = true;

		while (run) {
			System.out.println(
					"--------------------------------------------------");
			System.out.println(
					"1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
			System.out.println(
					"--------------------------------------------------");
			System.out.print("선택>");

			int selectNo = scanner.nextInt();
			scanner.nextLine();

			if (selectNo == 1) {
				createAcount();
			} else if (selectNo == 2) {
				accountList();
			} else if (selectNo == 3) {
				deposit();
			} else if (selectNo == 4) {
				withdraw();
			} else if (selectNo == 5) {
				run = false;
			}
		}
	}

	private static void createAcount() {
		System.out.println("----------------");
		System.out.println("계좌생성");
		System.out.println("----------------");
		System.out.print("계좌번호:");
		String ano = scanner.nextLine();
		System.out.print("계좌주:");
		String owner = scanner.nextLine();
		System.out.print("초기입금액:");
		int balance = scanner.nextInt();
		scanner.nextLine();
		
		Account account = new Account(ano, owner, balance);
		accountArray[size] = account;
		size++;
		
		System.out.println("결과: 계좌가 생성되었습니다.");
	}

	private static void accountList() {
		System.out.println("----------------");
		System.out.println("계좌목록");
		System.out.println("----------------");
		for (int i = 0; i < size; i++) {
			System.out.println(accountArray[i].getAno() + "\t"
					+ accountArray[i].getOwner() + "\t"
					+ accountArray[i].getBalance());
		}

	}

}
