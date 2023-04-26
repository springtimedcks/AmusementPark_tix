package z_AmusementPark;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Input_Class {
	Scanner scanner = new Scanner(System.in);

	private Print_Class printout = new Print_Class();

	static List<OrderList> data = new ArrayList<OrderList>();

	public int inputTicketSelect() {
		int ticketSelect = 0;
		while (true) {
			printout.PrintTicketSelect();
			ticketSelect = scanner.nextInt();

			if (ticketSelect == 1 || ticketSelect == 2)
				break;
			printout.PrintError();
		}
		return ticketSelect;
	}

	public String inputIdNumber() {
		String CustomerIdNumber;
		while (true) {
			printout.PrintIdNumber();
			CustomerIdNumber = scanner.next();
			if (CustomerIdNumber.length() == 13) break;
			printout.PrintError();
		}
		return CustomerIdNumber;
	}
	
	public int inputOrderQuantity() {
		int orderQuantity;
		while(true) {
			printout.PrintOrderQuantity();
			orderQuantity = scanner.nextInt();
			if(0 < orderQuantity && orderQuantity < 11) break;
			printout.PrintError();
		}
		return orderQuantity;
	}

}
































