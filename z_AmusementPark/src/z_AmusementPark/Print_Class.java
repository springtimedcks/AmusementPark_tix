package z_AmusementPark;

import java.util.Scanner;

public class Print_Class {
	Scanner scanner = new Scanner(System.in); // private Scanner scanner

	public void PrintTicketSelect() {
		System.out.println("권종을 선택하세요 : 1. 주간권   2. 야간권");
	}

	public void PrintIdNumber() {
		System.out.println("주민번호를 입력하세요. (-를 제외한 13자리)");
	}

	public void PrintOrderQuantity() {
		System.out.println("주문 수량을 입력하세요. (최대 10매)");
	}

	public void PrintSelectDiscountOpt() {
		System.out.println("우대사항을 선택하세요.");
		System.out.println("1. 없음 (나이 우대는 자동처리)");
		System.out.println("2. 장애인");
		System.out.println("3. 국가유공자");
		System.out.println("4. 다자녀");
		System.out.println("5. 임산부");
	}

	public void PrintError() {
		System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
	}

	public void PrintCustomerTotalPrice(int totalPrice) {
		System.out.println("가격은 " + totalPrice + "원 입니다. 감사합니다.");
	}

	public int PrintContinueTF() {
		System.out.println("계속 발권하시겠습니까?");
		System.out.println("1. 티켓 발권");
		System.out.println("2. 종료");
		int cNumber = scanner.nextInt();
		return cNumber;
	}

	public void PrintCustomerBillInfo() {
		System.out.println("티켓 발권을 종료합니다. 감사합니다.");
		System.out.println("============================ 에 버 랜 드 ============================");

		for (OrderList order : InputClass.data) {
			if (order.getTicketSelect() == 1)
				System.out.print("주간권 ");
			else
				System.out.printf("야간권 ");

			if (order.getAgeGroup() == 1)
				System.out.print("유아    ");
			else if (order.getAgeGroup() == 2)
				System.out.print("소인    ");
			else if (order.getAgeGroup() == 3)
				System.out.print("청소년  ");
			else if (order.getAgeGroup() == 4)
				System.out.print("대인    ");
			else if (order.getAgeGroup() == 5)
				System.out.print("경로    ");

			System.out.printf("x %d\t%d원\t", order.getOrderCount(), order.getTotalPrice());

			String gender = order.getCustomerIDNumber().substring(7, 8);
			if (gender.equals("1") || gender.equals("3") || gender.equals("5") || gender.equals("7")) {
				System.out.print("남성\t");
			} else {
				System.out.print("여성\t");
			}

			if (order.getDiscountSelect() == 1)
				System.out.println("* 우대적용 없음");
			else if (order.getDiscountSelect() == 2)
				System.out.println("* 장애인 우대적용");
			else if (order.getDiscountSelect() == 3)
				System.out.println("* 국가유공자 우대적용");
			else if (order.getDiscountSelect() == 4)
				System.out.println("* 다자녀 우대적용");
			else if (order.getDiscountSelect() == 5)
				System.out.println("* 임산부 우대적용");

		}
	}
}
