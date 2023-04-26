package z_AmusementPark;

import java.util.Scanner;

public class Print_Class {
	Scanner scanner = new Scanner(System.in); // private Scanner scanner

	public void PrintTicketSelect() {
		System.out.println("������ �����ϼ��� : 1. �ְ���   2. �߰���");
	}

	public void PrintIdNumber() {
		System.out.println("�ֹι�ȣ�� �Է��ϼ���. (-�� ������ 13�ڸ�)");
	}

	public void PrintOrderQuantity() {
		System.out.println("�ֹ� ������ �Է��ϼ���. (�ִ� 10��)");
	}

	public void PrintSelectDiscountOpt() {
		System.out.println("�������� �����ϼ���.");
		System.out.println("1. ���� (���� ���� �ڵ�ó��)");
		System.out.println("2. �����");
		System.out.println("3. ����������");
		System.out.println("4. ���ڳ�");
		System.out.println("5. �ӻ��");
	}

	public void PrintError() {
		System.out.println("�߸��� �Է��Դϴ�. �ٽ� �Է����ּ���.");
	}

	public void PrintCustomerTotalPrice(int totalPrice) {
		System.out.println("������ " + totalPrice + "�� �Դϴ�. �����մϴ�.");
	}

	public int PrintContinueTF() {
		System.out.println("��� �߱��Ͻðڽ��ϱ�?");
		System.out.println("1. Ƽ�� �߱�");
		System.out.println("2. ����");
		int cNumber = scanner.nextInt();
		return cNumber;
	}

	public void PrintCustomerBillInfo() {
		System.out.println("Ƽ�� �߱��� �����մϴ�. �����մϴ�.");
		System.out.println("============================ �� �� �� �� ============================");

		for (OrderList order : InputClass.data) {
			if (order.getTicketSelect() == 1)
				System.out.print("�ְ��� ");
			else
				System.out.printf("�߰��� ");

			if (order.getAgeGroup() == 1)
				System.out.print("����    ");
			else if (order.getAgeGroup() == 2)
				System.out.print("����    ");
			else if (order.getAgeGroup() == 3)
				System.out.print("û�ҳ�  ");
			else if (order.getAgeGroup() == 4)
				System.out.print("����    ");
			else if (order.getAgeGroup() == 5)
				System.out.print("���    ");

			System.out.printf("x %d\t%d��\t", order.getOrderCount(), order.getTotalPrice());

			String gender = order.getCustomerIDNumber().substring(7, 8);
			if (gender.equals("1") || gender.equals("3") || gender.equals("5") || gender.equals("7")) {
				System.out.print("����\t");
			} else {
				System.out.print("����\t");
			}

			if (order.getDiscountSelect() == 1)
				System.out.println("* ������� ����");
			else if (order.getDiscountSelect() == 2)
				System.out.println("* ����� �������");
			else if (order.getDiscountSelect() == 3)
				System.out.println("* ���������� �������");
			else if (order.getDiscountSelect() == 4)
				System.out.println("* ���ڳ� �������");
			else if (order.getDiscountSelect() == 5)
				System.out.println("* �ӻ�� �������");

		}
	}
}
